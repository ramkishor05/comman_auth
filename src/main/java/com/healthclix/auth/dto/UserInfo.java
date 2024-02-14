package com.healthclix.auth.dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.healthclix.auth.entity.AdminUser;
import com.healthclix.auth.entity.Patients;
import com.healthclix.auth.entity.Users;

public class UserInfo implements UserDetails {

	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private Collection<? extends GrantedAuthority> authorities;

	public UserInfo() {
	}

	public UserInfo(Users users, Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
		this.username = users.email;
		this.password = users.password;
	}

	public UserInfo(AdminUser users, Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
		this.username = users.email;
		this.password = users.password;
		System.out.println("users.password="+users.password);
	}

	public UserInfo(Patients users, Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
		this.username = users.email;
		this.password = users.password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}
	
	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	
}
