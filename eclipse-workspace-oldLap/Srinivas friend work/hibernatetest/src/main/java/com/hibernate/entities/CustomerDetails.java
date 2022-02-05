package com.hibernate.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {
	
	@Column(name = "customer_id")
	private String customerId;
 
	@Column(name = "job_Title")
	private String jobTitle;

	@Column(name = "internal_customer_id")
	private String internalCustomerId;

	@Column(name = "registration_date")
	private Date registrationDate;

	@Column(name = "customer_name")
	private String customerName;

	@Column(name = "customer_company")
	private String customerCompany;

	@Column(name = "no_Of_Employees_in_Org")
	private String numberOfEmployeesInOrganisation;

	@Id
	@Column(name = "email_id")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "contact_number")
	private long contactNumber;

	@Column(name = "Spire_status")
	private String spireStatus;

	@Column(name = "address1")
	private String address1;

	@Column(name = "address2")
	private String address2;

	@Column(name = "address3")
	private String address3;

	@Column(name = "country")
	private String country;

	@Column(name = "pinCode")
	private String pinCode;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "tokenId")
	private String tokenId;

	@Column(name = "description")
	private String description;

	@Column(name = "industry")
	private String industry;

	@Column(name = "website")
	private String website;

	@Column(name = "jobFunction")
	private String jobFunction;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getInternalCustomerId() {
		return internalCustomerId;
	}

	public void setInternalCustomerId(String internalCustomerId) {
		this.internalCustomerId = internalCustomerId;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}

	

	public String getNumberOfEmployeesInOrganisation() {
		return numberOfEmployeesInOrganisation;
	}

	public void setNumberOfEmployeesInOrganisation(String numberOfEmployeesInOrganisation) {
		this.numberOfEmployeesInOrganisation = numberOfEmployeesInOrganisation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getSpireStatus() {
		return spireStatus;
	}

	public void setSpireStatus(String spireStatus) {
		this.spireStatus = spireStatus;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTokenId() {
		return tokenId;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getJobFunction() {
		return jobFunction;
	}

	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

}
