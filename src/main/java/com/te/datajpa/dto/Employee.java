package com.te.datajpa.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Data
@Entity
@Table
public class Employee implements Serializable{
	@Id
	@Column
	private int empid;
	private String ename;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dob;
	private String password;

}
