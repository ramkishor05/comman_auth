package com.healthclix.auth.service.impl;

import static com.healthclix.auth.constant.Contants.PROVIDER_USER_SERVICE;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.healthclix.auth.constant.Authority;
import com.healthclix.auth.dto.UserInfo;
import com.healthclix.auth.entity.AdminUser;
import com.healthclix.auth.repository.AdminUserRepository;
import com.healthclix.auth.service.UserService;

@Service(PROVIDER_USER_SERVICE)
public class ProviderUserServiceImpl implements UserService {
	
	@Autowired
	private AdminUserRepository adminUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<AdminUser> findByEmail = adminUserRepository.findByEmail(username);
		return findByEmail.map((adminUser)->new UserInfo(adminUser, getGrantedAuthority(Authority.PROVIDER.toString()))) 
        .orElseThrow(() -> new UsernameNotFoundException("User not found " + username)); 
	}
}
