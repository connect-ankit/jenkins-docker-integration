package com.inn.ccm.student.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address implements Serializable {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer address_id;
	private String state;
	private String pin;
	private String location;
	
	@Column(name = "studentid_fk")
	private Integer studentId;
	 
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", state=" + state + ", pin=" + pin + ", location=" + location
				+ "]";
	}
	
	
	
}
