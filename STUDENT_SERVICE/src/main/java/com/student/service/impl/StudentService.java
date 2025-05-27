package com.student.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.student.service.entity.primary.Student;
import com.student.service.model.UserRequest;
import com.student.service.repo.primary.StudentRepo;
import com.student.service.repo.secondary.ContactsRepo;

@Service("STU-SERVICE")
public class StudentService {

	private  final StudentRepo studentRepo;

	private  final ContactsRepo contactsRepo;
	
	
	
	
	public StudentService(StudentRepo studentRepo, ContactsRepo contactsRepo) {
		this.studentRepo = studentRepo;
		this.contactsRepo = contactsRepo;
	}

	public Student savestudent(UserRequest s) {
		
		System.out.println(s.toString());
		contactsRepo.save(s.getContacts());
		return studentRepo.save(s.getStudent());
		
		
	}
	
	public Student getStudent(Long id) {
		contactsRepo.findById(id);
		
		return studentRepo.findById(id).orElseThrow(()-> new RuntimeException("No Data Fond"));
	}
	public List<Student> getAllStudent(){
		List<Student> all = studentRepo.findAll();
		
	
		
		
		return all;
	}
}
