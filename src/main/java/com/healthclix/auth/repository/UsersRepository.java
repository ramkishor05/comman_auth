package com.healthclix.auth.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healthclix.auth.entity.Users;

public interface UsersRepository extends JpaRepository<Users, UUID>{

	Optional<Users> findByEmail(String email);

	boolean existsByEmailAndPassword(String email, String password);

}
