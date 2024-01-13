package com.app.EMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.EMS.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Long> {

}
