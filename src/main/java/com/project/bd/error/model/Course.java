package com.project.bd.error.model;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseId;
    private String courseCode;
    private String CourseName;
    private int courseDuration;
    private String dayOfWeek;
    private double amount;
    private String ageLimit;
    private String aboutCourse;
    private String coursePolicy;
    private String safety;

    @ManyToOne
    @JoinColumn(name = "instructor_id", nullable = false)
    private Instructor instructor;

    // ✅ Override toString() to return only the course name
    @Override
    public String toString() {
        return CourseName;
    }




    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course() {
    }

    public Course(int courseId, String courseCode, String courseName, int courseDuration, String dayOfWeek, double amount, String ageLimit, String aboutCourse, String coursePolicy, String safety) {
        this.courseId = courseId;
        this.courseCode = courseCode;
        CourseName = courseName;
        this.courseDuration = courseDuration;
        this.dayOfWeek = dayOfWeek;
        this.amount = amount;
        this.ageLimit = ageLimit;
        this.aboutCourse = aboutCourse;
        this.coursePolicy = coursePolicy;
        this.safety = safety;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public int getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(int courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(String ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getAboutCourse() {
        return aboutCourse;
    }

    public void setAboutCourse(String aboutCourse) {
        this.aboutCourse = aboutCourse;
    }

    public String getCoursePolicy() {
        return coursePolicy;
    }

    public void setCoursePolicy(String coursePolicy) {
        this.coursePolicy = coursePolicy;
    }

    public String getSafety() {
        return safety;
    }

    public void setSafety(String safety) {
        this.safety = safety;
    }
}
