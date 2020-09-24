package com.tuan.springjwt.models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "employee")
public class Employee {

	private long id;
	private String name;
	private String email;
	private String title;
	private Date DOB;
	
	
//	@OneToMany(targetEntity=Employee.class, fetch=FetchType.LAZY,
//			 cascade=CascadeType.ALL)\
	/*
	 * @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	 * 
	 * @JsonIgnore
	 */
	private Set<EDepartment> department;
	 	
	public Employee() {
	}
	
	public Employee(String name, String title, String email, Date DOB) {
		this.title = title;
		this.name = name;
		this.email = email;
		this.DOB = DOB;
//		this.department = department;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "Title", nullable = false)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "Name", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	@Email
	@Column(name = "email", nullable = false)
	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
	@Column(name ="DOB", nullable = false )
	public Date getDob() {
		return DOB;
	}
	
	public void setDob(Date DOB) {
		this.DOB = DOB;
	}

	
	
	 public Set<EDepartment> getDepartment() { return department; }
	  
	 public void setDepartment(Set<EDepartment> department) { this.department =
	 department; }
	 
}

	
	  
	 
	
	
		/*
		 * @Column(name = "department", nullable = false) public Department
		 * getDepartment() { return department; }
		 * 
		 * public void setDepartment(Department department) { this.department =
		 * department; }
		 */
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", title=" + title + ", name=" + name + ", email=" + email + ", DOB ="
//				+ DOB + ", department = " + department + "]";
//	}
