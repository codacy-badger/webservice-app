package com.empanada.app.webservice.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="users")
public class UserEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id // Primary key and Autoincrement
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	//public ID
	@Column(nullable = false)
	private String userId;
	
	@Column(nullable = false, length = 50)
	private String firstName;
	
	@Column(nullable = false, length = 50)
	private String lastName;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@Column(nullable = false)
	private String encryptedPassword;
	
	private String emailVerificationToken;
	
	@Column(nullable = false)
	private Boolean emailVerficationStatus = false; 
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getEmailVerificationToken() {
		return emailVerificationToken;
	}

	public void setEmailVerificationToken(String emailVerificationToken) {
		this.emailVerificationToken = emailVerificationToken;
	}

	public Boolean getEmailVerficationStatus() {
		return emailVerficationStatus;
	}

	public void setEmailVerficationStatus(Boolean emailVerficationStatus) {
		this.emailVerficationStatus = emailVerficationStatus;
	}

	
}
