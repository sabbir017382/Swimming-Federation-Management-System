package com.project.bd.error.controller;

import com.project.bd.error.dto.InstructorDto;
import com.project.bd.error.model.Instructor;
import com.project.bd.error.service.InstructorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InstructorController {

    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }


    @GetMapping("/instructor")
    public String instructor(Model model)
    {
        List<Instructor> instructorList =instructorService.getAllInstructors();
        model.addAttribute("instructorList",instructorList);
        return "instructor";
    }




    @GetMapping("/createInstructorAdmin")
    public String createInstructorAdmin( Model model)
    {
        model.addAttribute("dto", new InstructorDto());
        return "createInstructorAdmin";

    }


    @PostMapping("/saveInstructor")
    public String saveRegistration(@ModelAttribute InstructorDto dto, Model model) {
        Instructor instructor=new Instructor();
        instructor.setInstructorName(dto.getInstructorName());
        instructor.setInstructorUserName(dto.getInstructorUserName());
        instructor.setInstructorEmail(dto.getInstructorEmail());
        instructor.setInstructorPassword(dto.getInstructorPassword());
        instructor.setContact(dto.getContact());
        instructor.setAboutMe(dto.getAboutMe());
        instructor.setImage(dto.getImage());
        instructor.setEducation(dto.getEducation());
        instructor.setExperience(dto.getExperience());
        instructor.setCourseCodes(dto.getCourseCodes());

        instructorService.saveInstructor(instructor);

        model.addAttribute("dto", new InstructorDto());


        return "redirect:/createInstructorAdmin";
    }



    @GetMapping("/instructorListAdmin")
    public String instructorListAdmin(Model model)
    {
        List<Instructor> instructorList =instructorService.getAllInstructors();
        model.addAttribute("instructorList",instructorList);
        return "instructorListAdmin";
    }

    @GetMapping("/instructorProfile")
    public String instructorProfile()
    {
        return "instructorProfile";
    }



    @GetMapping ("/saveInstructor")
    public String updateInstructorPage(@ModelAttribute String instructorUserName, Model model) {
       Optional<Instructor> instructor=instructorService.updateInstructor(instructorUserName);


       if(instructor.isPresent()){
           InstructorDto instructorDto=new InstructorDto();
           instructorDto.setInstructorName(instructor.get().getInstructorName());
           instructorDto.setInstructorUserName(instructor.get().getInstructorUserName());
           instructorDto.setInstructorEmail(instructor.get().getInstructorEmail());
           instructorDto.setInstructorPassword(instructor.get().getInstructorPassword());
           instructorDto.setContact(instructor.get().getContact());
           instructorDto.setAboutMe(instructor.get().getAboutMe());
           instructorDto.setImage(instructor.get().getImage());
           instructorDto.setEducation(instructor.get().getEducation());
           instructorDto.setExperience(instructor.get().getExperience());
           instructorDto.setCourseCodes(instructor.get().getCourseCodes());

           model.addAttribute("instructor",instructorService.getAllInstructors());
           model.addAttribute("dto",instructorDto);
           return "redirect:/createInstructorAdmin";
       }
       else {
           return "Instructor Not Found";
       }
    }








}
