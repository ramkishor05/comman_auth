package com.healthclix.auth.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.healthclix.auth.constant.Authority;
import com.healthclix.auth.dto.LoginRequest;
import com.healthclix.auth.service.TokenService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	private TokenService tokenService;
	
	@Autowired
    private AuthenticationManager authenticationManager; 

	@PostMapping("/care_manager/login")
	public String userLogin(@RequestBody LoginRequest authRequest) {
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword(), getGrantedAuthority(Authority.CARE_MANAGER.toString() ))); 
		if (authenticate.isAuthenticated()) {
			return tokenService.generateToken(authRequest.getUsername(),Authority.CARE_MANAGER.toString());
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}
	}
	
	private List<GrantedAuthority> getGrantedAuthority(String authority) {
		return Arrays.asList(new GrantedAuthority() {
			
			private static final long serialVersionUID = 1L;

			@Override
			public String getAuthority() {
				return authority;
			}
		});
	}

	@PostMapping("/provider/login")
	public String adminLogin(@RequestBody LoginRequest authRequest) {
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword(), getGrantedAuthority(Authority.PROVIDER.toString() ))); 
		System.out.println("authenticate.isAuthenticated()="+authenticate.isAuthenticated());
		if (authenticate.isAuthenticated()) {
			return tokenService.generateToken(authRequest.getUsername(),Authority.PROVIDER.toString());
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}
	}
	
	@PostMapping("/patients/login")
	public String patientLogin(@RequestBody LoginRequest authRequest) {
		Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword(), getGrantedAuthority(Authority.PATIENTS.toString() ))); 
		if (authenticate.isAuthenticated()) {
			return tokenService.generateToken(authRequest.getUsername(),Authority.PATIENTS.toString());
		} else {
			throw new UsernameNotFoundException("invalid user request !");
		}
	}

}
