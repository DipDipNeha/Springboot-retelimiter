package com.student.service.repo.primary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.service.entity.primary.Student;

@Repository("STU-REPO")
public interface StudentRepo extends JpaRepository<Student,Long> {

	
}
