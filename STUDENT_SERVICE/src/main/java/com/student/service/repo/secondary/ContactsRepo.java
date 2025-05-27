package com.student.service.repo.secondary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.service.entity.secondary.Contacts;

@Repository("CONS-REPO")
public interface ContactsRepo extends JpaRepository<Contacts,Long> {

	
}
