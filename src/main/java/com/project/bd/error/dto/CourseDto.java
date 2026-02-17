package com.project.bd.error.dto;

import java.time.DayOfWeek;

public class CourseDto {
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

    public CourseDto() {
    }

    public CourseDto(int courseId, String courseCode, String courseName, int courseDuration, String dayOfWeek, double amount, String ageLimit, String aboutCourse, String coursePolicy, String safety) {
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
