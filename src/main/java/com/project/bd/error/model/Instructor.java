package com.project.bd.error.model;

import jakarta.persistence.*;
import org.hibernate.engine.internal.Cascade;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.List;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String instructorName;

    private String instructorUserName;
    private String instructorEmail;
    private String instructorPassword;
    private String contact;
    private String aboutMe;
    private byte[] image;
    private String education;
    private String experience;
    @OneToMany(mappedBy = "instructor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courses;

    @ElementCollection
    private List<String> courseCodes;

    @Transient  // This field is not saved in DB
    private List<String> courseNames;


    public Instructor() {
    }

    public Instructor(int id, String instructorName, String instructorUserName, String instructorEmail, String instructorPassword, String contact, String aboutMe, byte[] image, String education, String experience, List<Course> courses, List<String> courseCodes, List<String> courseNames) {
        this.id = id;
        this.instructorName = instructorName;
        this.instructorUserName = instructorUserName;
        this.instructorEmail = instructorEmail;
        this.instructorPassword = instructorPassword;
        this.contact = contact;
        this.aboutMe = aboutMe;
        this.image = image;
        this.education = education;
        this.experience = experience;
        this.courses = courses;
        this.courseCodes = courseCodes;
        this.courseNames = courseNames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorUserName() {
        return instructorUserName;
    }

    public void setInstructorUserName(String instructorUserName) {
        this.instructorUserName = instructorUserName;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    public String getInstructorPassword() {
        return instructorPassword;
    }

    public void setInstructorPassword(String instructorPassword) {
        this.instructorPassword = instructorPassword;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<String> getCourseCodes() {
        return courseCodes;
    }

    public void setCourseCodes(List<String> courseCodes) {
        this.courseCodes = courseCodes;
    }

    public List<String> getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(List<String> courseNames) {
        this.courseNames = courseNames;
    }
}