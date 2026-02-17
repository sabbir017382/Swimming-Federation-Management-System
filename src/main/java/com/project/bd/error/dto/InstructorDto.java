package com.project.bd.error.dto;

import com.project.bd.error.model.Course;

import java.util.List;

public class InstructorDto {
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
    private List<String> courseCodes;

    public InstructorDto(int id, String instructorName, String instructorUserName, String instructorEmail, String instructorPassword, String contact, String aboutMe, String education, String experience, List<String> courseCodes) {
    }

    public List<String> getCourseCodes() {
        return courseCodes;
    }

    public void setCourseCodes(List<String> courseCodes) {
        this.courseCodes = courseCodes;
    }

    public InstructorDto() {
    }

    public InstructorDto(int id, String instructorName, String instructorUserName, String instructorEmail, String instructorPassword, String contact, String aboutMe, byte[] image, String education, String experience, String courseCode) {
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
        this.courseCodes = getCourseCodes();
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


}
