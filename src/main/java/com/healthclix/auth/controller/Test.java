package com.healthclix.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	@GetMapping("/care")
	@PreAuthorize("hasAuthority('CARE_MANAGER')")
	public String msg() {
		return "CARE_MANAGER";
	}

	@GetMapping("/patients")
	@PreAuthorize("hasAuthority('PATIENTS')")
	public String user() {
		return "PATIENTS";
	}
	
	@GetMapping("/provider")
	@PreAuthorize("hasAuthority('PROVIDER')")
	public String admin() {
		return "PROVIDER";
	}
}
