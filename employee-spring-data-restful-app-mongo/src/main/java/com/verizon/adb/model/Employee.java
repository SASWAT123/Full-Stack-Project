package com.verizon.adb.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection = "employees")
public class Employee {

	@Id
	private long empId;

	@NotEmpty(message = "Name cannot be empty")
	@Size(min = 5, max = 20, message = "Name length must be between 5 to 20 chars")
	private String empName;

	@Field(value = "basic")
	private double empBasic;

	@NotEmpty(message = "Email ID cannot be null")
	@Email(message = "Invalid Email Id")
	private String empEmail;

	@NotEmpty(message = "Mobile number cannot be empty")
	@Pattern(regexp = "\\d{10}", message = "mobile number can be only 10 digits")
	@Field(value = "mob")
	private String empMobile;

	@NotEmpty(message = "Dept cannot be null")
	private String empDept;

	@DateTimeFormat(iso = ISO.DATE)
	@NotNull(message = "Date of Birth cannot be left blank")
	@Field(value = "dob")
	private LocalDate dateOfBirth;

	private String gender;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpBasic() {
		return empBasic;
	}

	public void setEmpBasic(double empBasic) {
		this.empBasic = empBasic;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpMobile() {
		return empMobile;
	}

	public void setEmpMobile(String empMobile) {
		this.empMobile = empMobile;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
