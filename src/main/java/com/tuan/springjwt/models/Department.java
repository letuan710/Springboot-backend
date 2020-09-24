package com.tuan.springjwt.models;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="department")
public class Department {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;   
   @Column(length = 20)
   private String departmentName;

	
//   @ManyToOne(targetEntity=Employee.class, fetch=FetchType.LAZY,
//			 cascade=CascadeType.ALL)	 
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "department_id") private Employee employee;
	 */
   public Department() {
	   
   }  
   public Department(String departmentName) {
	   this.departmentName = departmentName;
   }
   
   public int getId() {
	   return id;
   }
   
   public void setId(int id) {
	   this.id = id;
   }
   
   public String getDepartmentName() {
	   return departmentName;
   }
   
   public void setDepartmentName(String departmentName) {
	   this.departmentName = departmentName;
   }
}
