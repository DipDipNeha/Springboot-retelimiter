package com.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.service.entity.Student;
import com.student.service.repo.StudentRepo;

@Service("STU-SERVICE")
public class StudentService {

	private  final StudentRepo studentRepo;

	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;

	}
	
	
	public Student savestudent(Student s) {
		return studentRepo.save(s);
	}
	
	public Student getStudent(Long id) {
		return studentRepo.findById(id).orElseThrow(()-> new RuntimeException("No Data Fond"));
	}
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
	}
}
