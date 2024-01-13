package com.app.EMS.service;

import java.util.List;

import com.app.EMS.dto.EmpDataDto;
import com.app.EMS.entity.Employee;

public interface EmsService {

	List<Employee>getAllEmp();
	String saveEmpData(EmpDataDto e);
}
