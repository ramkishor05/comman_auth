package com.healthclix.auth.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.healthclix.auth.entity.AdminUser;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser, UUID>{

	@Query(nativeQuery = true, value = "select * FROM public.admin_users where email=?1")
	Optional<AdminUser> findByEmail(String email);

	boolean existsByEmailAndPassword(String email, String password);

}
