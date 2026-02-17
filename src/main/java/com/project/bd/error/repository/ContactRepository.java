package com.project.bd.error.repository;

import com.project.bd.error.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository  extends JpaRepository<Contact,Integer> {
}
