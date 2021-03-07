/**
 * 
 */
package com.inn.ccm.student.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

/**
 * @author ankit.tiwari
 *
 */
@Setter
@Getter
@Entity

public class Student implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String name;
	private String email;
	private String phone;
	
	
	@JoinColumn(name = "studentid_fk", referencedColumnName = "id")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Address> address;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	
	
	
}
