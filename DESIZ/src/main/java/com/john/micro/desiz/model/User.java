package com.john.micro.desiz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private int numberOfPerson;
	private Long eachContribution;
	private Date timeOfVisit;
	private int periodOfStay;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public int getNumberOfPerson() {
		return numberOfPerson;
	}

	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}

	public Long getEachContribution() {
		return eachContribution;
	}

	public void setEachContribution(Long eachContribution) {
		this.eachContribution = eachContribution;
	}

	public Date getTimeOfVisit() {
		return timeOfVisit;
	}

	public void setTimeOfVIsit(Date timeOfVisit) {
		this.timeOfVisit = timeOfVisit;
	}

	public int getPeriodOfStay() {
		return periodOfStay;
	}

	public void setPeriodOfStay(int periodOfStay) {
		this.periodOfStay = periodOfStay;
	}

}
