package com.app.EMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.EMS.dto.EmpDataDto;
import com.app.EMS.service.EmsService;

@RestController
@CrossOrigin
@RequestMapping("/ems")
public class EmsController {

	@Autowired
	private EmsService emsService;
	
	@GetMapping("/all")
 public	ResponseEntity<?> getAllEmployees()
	{
		return new ResponseEntity<>(emsService.getAllEmp(),HttpStatus.OK);
	}
	
	@PostMapping("/addEmp")
	 public String saveEmployee(@RequestBody EmpDataDto  e) {
	
		System.out.println(e);	
		return emsService.saveEmpData(e);
	}
}
