package com.healthclix.auth.service.impl;

import static com.healthclix.auth.constant.Contants.PATIENT_USER_SERVICE;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.healthclix.auth.constant.Authority;
import com.healthclix.auth.dto.UserInfo;
import com.healthclix.auth.entity.Patients;
import com.healthclix.auth.repository.PatientsRepository;
import com.healthclix.auth.service.UserService;

@Service(PATIENT_USER_SERVICE)
public class PatientUserServiceImpl implements UserService {
	
	@Autowired
	private PatientsRepository patientsRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {
		Optional<Patients> findByEmail = patientsRepository.findByEmail(username);
		System.out.println("Patients findByEmail = "+findByEmail.isPresent());
		
		return findByEmail.map((patientUser)->new UserInfo(patientUser, getGrantedAuthority(Authority.PATIENTS.toString()))) 
        .orElseThrow(() -> new UsernameNotFoundException("User not found " + username)); 
	}
}
