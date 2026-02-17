package com.project.bd.error.service;

import com.project.bd.error.model.Course;
import com.project.bd.error.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public Course createCourse(Course course)
    {
        return courseRepository.save(course);
    }
    public List<Course> getAllCourse()
    {
        return courseRepository.findAll();
    }

}
