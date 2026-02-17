package com.project.bd.error.service;

import com.project.bd.error.model.Contact;
import com.project.bd.error.model.Course;
import com.project.bd.error.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }


    public Contact saveContact(Contact contact)
    {
       return contactRepository.save(contact);
    }

    public List<Contact> getAllContacts()
    {
        return contactRepository.findAll();
    }
}
