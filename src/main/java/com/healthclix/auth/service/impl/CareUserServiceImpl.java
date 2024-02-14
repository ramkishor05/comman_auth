package com.healthclix.auth.service.impl;

import static com.healthclix.auth.constant.Contants.CARE_USER_SERVICE;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.healthclix.auth.constant.Authority;
import com.healthclix.auth.dto.UserInfo;
import com.healthclix.auth.entity.Users;
import com.healthclix.auth.repository.UsersRepository;
import com.healthclix.auth.service.UserService;

@Service(CARE_USER_SERVICE)
public class CareUserServiceImpl implements UserService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<Users> findByEmail = usersRepository.findByEmail(username);
		System.out.println("CareUser findByEmail = "+findByEmail.isPresent());
		return findByEmail.map((careUser)->new UserInfo(careUser, getGrantedAuthority(Authority.CARE_MANAGER.toString()))) 
        .orElseThrow(() -> new UsernameNotFoundException("User not found " + username)); 
	}
}
