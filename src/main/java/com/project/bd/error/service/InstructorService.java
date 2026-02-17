package com.project.bd.error.service;

import com.project.bd.error.dto.InstructorDto;
import com.project.bd.error.model.Course;
import com.project.bd.error.model.Instructor;
import com.project.bd.error.repository.CourseRepository;
import com.project.bd.error.repository.InstructorRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class InstructorService {

    private final InstructorRepository instructorRepository;
    private final CourseRepository courseRepository;

    public InstructorService(InstructorRepository instructorRepository, CourseRepository courseRepository) {
        this.instructorRepository = instructorRepository;
        this.courseRepository = courseRepository;
    }

    public Instructor saveInstructor(Instructor instructor)
    {
        return instructorRepository.save(instructor);
    }

    public List<Instructor> getAllInstructors() {
        List<Instructor> instructors = instructorRepository.findAll();

        for (Instructor instructor : instructors) {
            List<String> courseCodes = Optional.ofNullable(instructor.getCourseCodes()).orElse(Collections.emptyList());

            if (courseCodes.isEmpty()) {
                instructor.setCourseNames(Collections.emptyList());
                continue;
            }

            // ✅ Fetch course names for multiple course codes
            List<String> courseNames = courseRepository.findByCourseCodeIn(courseCodes)
                    .stream()
                    .map(Course::getCourseName)
                    .collect(Collectors.toList());

            instructor.setCourseNames(courseNames);
        }

        return instructors;
    }


    public Optional< Instructor> updateInstructor(String instructorUserName)
    {

       return instructorRepository.findByInstructorUserName(instructorUserName);
    }




}
