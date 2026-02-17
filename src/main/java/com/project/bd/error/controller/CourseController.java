package com.project.bd.error.controller;

import com.project.bd.error.dto.CourseDto;
import com.project.bd.error.dto.LoginDto;
import com.project.bd.error.model.Course;
import com.project.bd.error.model.User;
import com.project.bd.error.service.CourseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CourseController {


    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/course")
    public String coursePage(Model model){

        List<Course> courseList=courseService.getAllCourse();

        model.addAttribute("courseList",courseList);
        return "course";
    }

    @GetMapping("/createCourseAdmin")
    public String CreateCoursepage(Model model)
    {
        model.addAttribute("dto",new CourseDto());
        return "createCourseAdmin";
    }
    @PostMapping("/courseCreate")
    public String createCourse(@ModelAttribute CourseDto dto,Model model)
    {
        Course course = new Course();
        course.setCourseCode(dto.getCourseCode());
        course.setCourseName(dto.getCourseName());
        course.setCourseDuration(dto.getCourseDuration());
        course.setDayOfWeek(dto.getDayOfWeek());
        course.setAmount(dto.getAmount());
        course.setAgeLimit(dto.getAgeLimit());
        course.setAboutCourse(dto.getAboutCourse());
        course.setCoursePolicy(dto.getCoursePolicy());
        course.setSafety(dto.getSafety());

        courseService.createCourse(course);
        return "redirect:/createCourseAdmin";

    }

    @GetMapping("/courseDetails")
    public String courseDetails(Model model){
        List<Course> courseList=courseService.getAllCourse();

        model.addAttribute("courseList",courseList);
        return "courseDetails";
    }

    @GetMapping("/courseSchedule")
    public String courseSchedule(Model model)
    {
        List<Course> courseList=courseService.getAllCourse();

        model.addAttribute("courseList",courseList);
        return "courseSchedule";
    }

    @GetMapping("/courseList")
    public String courseList(Model model)
    {

        List<Course> courseList=courseService.getAllCourse();

        model.addAttribute("courseList",courseList);
        return "courseList";
    }




}
