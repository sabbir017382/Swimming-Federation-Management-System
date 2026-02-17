package com.project.bd.error.repository;

import com.project.bd.error.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository  extends JpaRepository<Course,Integer> {

    List<Course> findByCourseCodeIn(List<String> courseCodes);
}
