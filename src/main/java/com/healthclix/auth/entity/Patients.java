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
@Table(name = "PATIENTS")
public class Patients {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "UUID.randomUUID()")
	public UUID id;
	public String email;
	@Column(name = "ENCRYPTED_PASSWORD")
	public String password;
	public Integer status;
	public java.sql.Date date_of_birth;
	public Integer gender;
	public Boolean is_testimonial_worthy;
	public Boolean is_ccm_all_access;
	public String language;
	public java.sql.Date enrollment_date;
	public Timestamp created_at;
	public Timestamp updated_at;
	public String other_conditions;
	public UUID default_specialist_id;
	public UUID health_system_id;
	public UUID hospital_id;
	public UUID practice_id;
	public UUID creator_id;
	public Timestamp deleted_at;
	public String emr;
	public String first_name;
	public String last_name;
	public String phone_number;
	public String patient_notes;
	public Integer contact_status;
	public String insurance_carrier;
	public String insurance_group_id;
	public String insurance_member_id;
	public String title;
	public String suffix;
	public String middle_name;
	public String preferred_name;
	public String reset_password_token;
	public String current_sign_in_ip;
	public String last_sign_in_ip;
	public Timestamp current_sign_in_at;
	public Timestamp last_sign_in_at;
	public Timestamp remember_created_at;
	public Timestamp reset_password_sent_at;
	public Integer sign_in_count;
	public Timestamp password_delivered_at;
	public UUID enrolling_provider_id;
	public String device_token;
	public String platform_type;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.sql.Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(java.sql.Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Boolean isIs_testimonial_worthy() {
		return is_testimonial_worthy;
	}

	public void setIs_testimonial_worthy(Boolean is_testimonial_worthy) {
		this.is_testimonial_worthy = is_testimonial_worthy;
	}

	public Boolean isIs_ccm_all_access() {
		return is_ccm_all_access;
	}

	public void setIs_ccm_all_access(Boolean is_ccm_all_access) {
		this.is_ccm_all_access = is_ccm_all_access;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public java.sql.Date getEnrollment_date() {
		return enrollment_date;
	}

	public void setEnrollment_date(java.sql.Date enrollment_date) {
		this.enrollment_date = enrollment_date;
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

	public String getOther_conditions() {
		return other_conditions;
	}

	public void setOther_conditions(String other_conditions) {
		this.other_conditions = other_conditions;
	}

	public UUID getDefault_specialist_id() {
		return default_specialist_id;
	}

	public void setDefault_specialist_id(UUID default_specialist_id) {
		this.default_specialist_id = default_specialist_id;
	}

	public UUID getHealth_system_id() {
		return health_system_id;
	}

	public void setHealth_system_id(UUID health_system_id) {
		this.health_system_id = health_system_id;
	}

	public UUID getHospital_id() {
		return hospital_id;
	}

	public void setHospital_id(UUID hospital_id) {
		this.hospital_id = hospital_id;
	}

	public UUID getPractice_id() {
		return practice_id;
	}

	public void setPractice_id(UUID practice_id) {
		this.practice_id = practice_id;
	}

	public UUID getCreator_id() {
		return creator_id;
	}

	public void setCreator_id(UUID creator_id) {
		this.creator_id = creator_id;
	}

	public Timestamp getDeleted_at() {
		return deleted_at;
	}

	public void setDeleted_at(Timestamp deleted_at) {
		this.deleted_at = deleted_at;
	}

	public String getEmr() {
		return emr;
	}

	public void setEmr(String emr) {
		this.emr = emr;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getPatient_notes() {
		return patient_notes;
	}

	public void setPatient_notes(String patient_notes) {
		this.patient_notes = patient_notes;
	}

	public Integer getContact_status() {
		return contact_status;
	}

	public void setContact_status(Integer contact_status) {
		this.contact_status = contact_status;
	}

	public String getInsurance_carrier() {
		return insurance_carrier;
	}

	public void setInsurance_carrier(String insurance_carrier) {
		this.insurance_carrier = insurance_carrier;
	}

	public String getInsurance_group_id() {
		return insurance_group_id;
	}

	public void setInsurance_group_id(String insurance_group_id) {
		this.insurance_group_id = insurance_group_id;
	}

	public String getInsurance_member_id() {
		return insurance_member_id;
	}

	public void setInsurance_member_id(String insurance_member_id) {
		this.insurance_member_id = insurance_member_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getPreferred_name() {
		return preferred_name;
	}

	public void setPreferred_name(String preferred_name) {
		this.preferred_name = preferred_name;
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

	public Timestamp getRemember_created_at() {
		return remember_created_at;
	}

	public void setRemember_created_at(Timestamp remember_created_at) {
		this.remember_created_at = remember_created_at;
	}

	public Timestamp getReset_password_sent_at() {
		return reset_password_sent_at;
	}

	public void setReset_password_sent_at(Timestamp reset_password_sent_at) {
		this.reset_password_sent_at = reset_password_sent_at;
	}

	public Integer getSign_in_count() {
		return sign_in_count;
	}

	public void setSign_in_count(Integer sign_in_count) {
		this.sign_in_count = sign_in_count;
	}

	public Timestamp getPassword_delivered_at() {
		return password_delivered_at;
	}

	public void setPassword_delivered_at(Timestamp password_delivered_at) {
		this.password_delivered_at = password_delivered_at;
	}

	public UUID getEnrolling_provider_id() {
		return enrolling_provider_id;
	}

	public void setEnrolling_provider_id(UUID enrolling_provider_id) {
		this.enrolling_provider_id = enrolling_provider_id;
	}

	public String getDevice_token() {
		return device_token;
	}

	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}

	public String getPlatform_type() {
		return platform_type;
	}

	public void setPlatform_type(String platform_type) {
		this.platform_type = platform_type;
	}

}
