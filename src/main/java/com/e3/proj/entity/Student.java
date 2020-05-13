package com.e3.proj.entity;

import javax.persistence.*;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "Name is required")
    @Column(name = "name")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "Please enter a valid name.")
    private String name;

    @NotBlank(message = "School ID is required")
    @Column(name = "school_id")
    @Pattern(regexp = "^\\d{9}$", message = "Please enter a valid school ID.")
    private String schoolId;

    @NotBlank(message = "Instructor name is required")
    @Column(name = "instructor_name")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "Please enter a valid name.")
    private String instructorName;

    @NotBlank(message = "Instructor email is required")
    @Column(name = "instructor_email")
    @Pattern(regexp = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$", message = "Please enter a valid email.")  // Regex to restrict number of characters in top-level domain
    private String instructorEmail;

    @NotBlank(message = "Course name is required")
    @Column(name = "course_name")
    private String courseName;

    @NotBlank(message = "Semester is required")
    @Column(name = "semester")
    private String semester;

    public Student() {
        // Empty constructor
    }

    public Student(String name, String schoolId, String instructorName, String instructorEmail, String courseName, String semester) {
        this.name = name;
        this.schoolId = schoolId;
        this.instructorName = instructorName;
        this.instructorEmail = instructorEmail;
        this.courseName = courseName;
        this.semester = semester;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return semester;
    }
}
