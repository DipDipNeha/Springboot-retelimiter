package com.student.service.model;

import com.student.service.entity.primary.Student;
import com.student.service.entity.secondary.Contacts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {

	private Student student;
	private Contacts contacts;
	@Override
	public String toString() {
		return "UserRequest [student=" + student + ", contacts=" + contacts + "]";
	}
	
	

}
