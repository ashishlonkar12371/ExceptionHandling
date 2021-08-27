package com.ashish.ReferenceWithException.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashish.ReferenceWithException.exception.CustomException;
import com.ashish.ReferenceWithException.exception.ResourceNotFoundException;
import com.ashish.ReferenceWithException.model.Student;
import com.ashish.ReferenceWithException.repository.StudentRepository;

@RestController
@RequestMapping(value = "/api/v1/")
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@GetMapping("/delete")
	public String deleteStudent() {
		if (true) {
			throw new CustomException();
		}
		return null;

	}
	
	@GetMapping("/update")
	public String updateStudent() {
		if (true) {
			throw new ResourceNotFoundException("Jai Mata Di Rocks...");
		}
		return null;

	}
}