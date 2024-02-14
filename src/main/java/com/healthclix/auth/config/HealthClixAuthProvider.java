package com.healthclix.auth.config;

import static com.healthclix.auth.constant.Contants.CARE_USER_SERVICE;
import static com.healthclix.auth.constant.Contants.PATIENT_USER_SERVICE;
import static com.healthclix.auth.constant.Contants.PROVIDER_USER_SERVICE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.healthclix.auth.constant.Authority;
import com.healthclix.auth.service.UserService;

@Component
public class HealthClixAuthProvider extends DaoAuthenticationProvider {

	@Autowired
	@Qualifier(CARE_USER_SERVICE)
	private UserService careUserService;
	
	@Autowired
	@Qualifier(PROVIDER_USER_SERVICE)
	private UserService providerUserService;
	
	@Autowired
	@Qualifier(PATIENT_USER_SERVICE)
	private UserService patientUserService;
	
	@Override
	protected void doAfterPropertiesSet() {
		
	}

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		List<String> authorityList=authorities==null ? new ArrayList<>(): authorities.stream().map(authoritie -> authoritie.getAuthority()).collect(Collectors.toList());
		UserDetailsService userDetailsService=null; 
		if(authorityList.contains(Authority.CARE_MANAGER.toString())) {
			userDetailsService=careUserService;
		}
		if(authorityList.contains(Authority.PROVIDER.toString())) {
			userDetailsService=providerUserService;
		}
		if(authorityList.contains(Authority.PATIENTS.toString())) {
			userDetailsService=patientUserService;
		}
		this.setPasswordEncoder(new BCryptPasswordEncoder());
		this.setUserDetailsService(userDetailsService);
		return super.authenticate(authentication);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
}