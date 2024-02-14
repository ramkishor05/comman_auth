package com.healthclix.auth.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthclix.auth.entity.Patients;

public interface PatientsRepository extends JpaRepository<Patients, UUID>{

	Optional<Patients> findByEmail(String email);

	boolean existsByEmailAndPassword(String email, String password);

}
