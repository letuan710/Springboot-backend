package com.tuan.springjwt.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuan.springjwt.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	List<Employee> findByName(String name, Pageable pageable);
	Page<Employee> findByTitleContaining(String title, Pageable pageable);
}
