package com.azza.model.member;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity @Data
@Table(name="membership")
public class Membership {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name="NAME" , columnDefinition = "NVARCHAR(50)")
	private String name;
	@Column(name="EMAIL" , columnDefinition = "NVARCHAR(155)")
	private String eMail;
	@Column(name="PASSWORD" , columnDefinition = "NVARCHAR(155)")
	private String passsword;
	
	private AccessLevel access;
	
	private AccountStatus status;
	
}
