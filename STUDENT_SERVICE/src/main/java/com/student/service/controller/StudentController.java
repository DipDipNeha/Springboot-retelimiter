package com.student.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.service.entity.primary.Student;
import com.student.service.impl.StudentService;
import com.student.service.model.UserRequest;

@RestController("STU-CONT")
@RequestMapping("/student")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostMapping("/save")
	public ResponseEntity<Student> save(@RequestBody UserRequest s) {
		
		System.out.println(s.toString());
		Student savestudent = studentService.savestudent(s);
		return new ResponseEntity<Student>(savestudent, HttpStatus.OK);
	}

	@GetMapping("/getstudent/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Long id) {

		Student student = studentService.getStudent(id);

		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAllStudent() {

		List<Student> allStudent = studentService.getAllStudent();
		return new ResponseEntity<List<Student>>(allStudent, HttpStatus.OK);

	}

}
