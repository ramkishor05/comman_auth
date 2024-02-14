package com.healthclix.auth.entity;

import java.sql.Timestamp;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ADMIN_USERS")
public class AdminUser {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID.randomUUID()")
	public UUID id;
	public String email;
	@Column(name = "ENCRYPTED_PASSWORD")
	public String password;
	public String reset_password_token;
	public Timestamp reset_password_sent_at;
	public Timestamp remember_created_at;
	public Integer sign_in_count;
	public Timestamp current_sign_in_at;
	public Timestamp last_sign_in_at;
	public String current_sign_in_ip;
	public String last_sign_in_ip;
	public String invitation_token;
	public Timestamp invitation_created_at;
	public Timestamp invitation_sent_at;
	public Timestamp invitation_accepted_at;
	public Integer invitation_limit;
	public String invited_by_type;
	public Long invited_by_id;
	public Integer invitations_count;
	public Timestamp created_at;
	public Timestamp updated_at;
	public String first_name;
	public String last_name;
	public UUID specialist_id;
	public UUID practice_id;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getReset_password_token() {
		return reset_password_token;
	}

	public void setReset_password_token(String reset_password_token) {
		this.reset_password_token = reset_password_token;
	}

	public Timestamp getReset_password_sent_at() {
		return reset_password_sent_at;
	}

	public void setReset_password_sent_at(Timestamp reset_password_sent_at) {
		this.reset_password_sent_at = reset_password_sent_at;
	}

	public Timestamp getRemember_created_at() {
		return remember_created_at;
	}

	public void setRemember_created_at(Timestamp remember_created_at) {
		this.remember_created_at = remember_created_at;
	}

	public Integer getSign_in_count() {
		return sign_in_count;
	}

	public void setSign_in_count(Integer sign_in_count) {
		this.sign_in_count = sign_in_count;
	}

	public Timestamp getCurrent_sign_in_at() {
		return current_sign_in_at;
	}

	public void setCurrent_sign_in_at(Timestamp current_sign_in_at) {
		this.current_sign_in_at = current_sign_in_at;
	}

	public Timestamp getLast_sign_in_at() {
		return last_sign_in_at;
	}

	public void setLast_sign_in_at(Timestamp last_sign_in_at) {
		this.last_sign_in_at = last_sign_in_at;
	}

	public String getCurrent_sign_in_ip() {
		return current_sign_in_ip;
	}

	public void setCurrent_sign_in_ip(String current_sign_in_ip) {
		this.current_sign_in_ip = current_sign_in_ip;
	}

	public String getLast_sign_in_ip() {
		return last_sign_in_ip;
	}

	public void setLast_sign_in_ip(String last_sign_in_ip) {
		this.last_sign_in_ip = last_sign_in_ip;
	}

	public String getInvitation_token() {
		return invitation_token;
	}

	public void setInvitation_token(String invitation_token) {
		this.invitation_token = invitation_token;
	}

	public Timestamp getInvitation_created_at() {
		return invitation_created_at;
	}

	public void setInvitation_created_at(Timestamp invitation_created_at) {
		this.invitation_created_at = invitation_created_at;
	}

	public Timestamp getInvitation_sent_at() {
		return invitation_sent_at;
	}

	public void setInvitation_sent_at(Timestamp invitation_sent_at) {
		this.invitation_sent_at = invitation_sent_at;
	}

	public Timestamp getInvitation_accepted_at() {
		return invitation_accepted_at;
	}

	public void setInvitation_accepted_at(Timestamp invitation_accepted_at) {
		this.invitation_accepted_at = invitation_accepted_at;
	}

	public Integer getInvitation_limit() {
		return invitation_limit;
	}

	public void setInvitation_limit(Integer invitation_limit) {
		this.invitation_limit = invitation_limit;
	}

	public String getInvited_by_type() {
		return invited_by_type;
	}

	public void setInvited_by_type(String invited_by_type) {
		this.invited_by_type = invited_by_type;
	}

	public Long getInvited_by_id() {
		return invited_by_id;
	}

	public void setInvited_by_id(Long invited_by_id) {
		this.invited_by_id = invited_by_id;
	}

	public Integer getInvitations_count() {
		return invitations_count;
	}

	public void setInvitations_count(Integer invitations_count) {
		this.invitations_count = invitations_count;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public UUID getSpecialist_id() {
		return specialist_id;
	}

	public void setSpecialist_id(UUID specialist_id) {
		this.specialist_id = specialist_id;
	}

	public UUID getPractice_id() {
		return practice_id;
	}

	public void setPractice_id(UUID practice_id) {
		this.practice_id = practice_id;
	}

}
