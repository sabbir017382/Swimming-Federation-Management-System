package com.project.bd.error.controller;

import com.project.bd.error.dto.ContactDto;
import com.project.bd.error.dto.CourseDto;
import com.project.bd.error.model.Contact;
import com.project.bd.error.model.Course;
import com.project.bd.error.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        List<Contact> contactList=contactService.getAllContacts();

        model.addAttribute("contactList",contactList);
        return "contact";
    }
    @GetMapping("/setContactAdmin")
    public String setContact(Model model)
    {
        model.addAttribute("dto", new ContactDto());
        return "setContactAdmin";
    }
    @PostMapping("/saveContact")
    public String contactInformation(@ModelAttribute ContactDto dto, Model model) {
        Contact contact = new Contact();
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());
        contact.setLocation(dto.getLocation());
        contact.setOpeningHour(dto.getOpeningHour());
        contactService.saveContact(contact);


        model.addAttribute("dto", new ContactDto());
         return "redirect:/setContactAdmin";

    }
    @GetMapping("/contactAdmin")
    public String adminContact(Model model)
    {
        List<Contact> contactList=contactService.getAllContacts();

        model.addAttribute("contactList",contactList);
        return "/contactAdmin";
    }

}
