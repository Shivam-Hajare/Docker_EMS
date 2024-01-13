package com.app.EMS.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.EMS.dto.EmpDataDto;
import com.app.EMS.entity.Employee;
import com.app.EMS.repository.EmpRepository;

@Service
@Transactional
public class EmsServiceImpl implements EmsService {

    @Autowired
    private EmpRepository empRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<Employee> getAllEmp() {
        List<Employee> allEmp = empRepository.findAll();
        return allEmp;
    }

    @Override
    public String saveEmpData(EmpDataDto e) {
        Employee newEmp = modelMapper.map(e, Employee.class);
     
        empRepository.save(newEmp);
        return "Employee data saved successfully"; // You can return an appropriate message
    }
}
