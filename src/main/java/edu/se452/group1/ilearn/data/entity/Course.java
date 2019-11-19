package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="CLASSES")
public class Course {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="COURSE_ID")
    private long id;

    @NotNull
    @Column(name="COURSE_NAME")
    private String name;

    @Column(length = 150)
    private String description;

    @NotNull
    @Column(name="COURSE_NUM")
    private long courseNum;

    @Column(name="SECTION_NUM")
    private long sectionNum;

    @ManyToMany(mappedBy = "studentCourses")
    private Set<Student> studentCourses = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher courseTeacher;

    @OneToMany(mappedBy = "assignmentCourse")
    private Set<Assignment> courseAssignments = new HashSet<>();

    public Course() {
    }

    public Course(@NotNull String name, String description, @NotNull long courseNum, long sectionNum, Set<Student> studentCourses, Teacher courseTeacher, Set<Assignment> courseAssignments) {
        this.name = name;
        this.description = description;
        this.courseNum = courseNum;
        this.sectionNum = sectionNum;
        this.studentCourses = studentCourses;
        this.courseTeacher = courseTeacher;
        this.courseAssignments = courseAssignments;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(long courseNum) {
        this.courseNum = courseNum;
    }

    public long getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(long sectionNum) {
        this.sectionNum = sectionNum;
    }

    public Set<Student> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<Student> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public Set<Assignment> getCourseAssignments() {
        return courseAssignments;
    }

    public void setCourseAssignments(Set<Assignment> courseAssignments) {
        this.courseAssignments = courseAssignments;
    }
}
