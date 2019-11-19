package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="ASSIGNMENT")
public class Assignment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ASSIGNMENT_ID")
    private long id;

    @NotNull
    @Column(name="ASSIGNMENT_NAME")
    private String assignmentName;

    @Column(name="ASSIGNMENT_DESCRIPTION")
    private String assignmentDescription;

    @OneToMany(mappedBy = "gradeAssignment")
    private Set<Grade> grades = new HashSet<>();

    @NotNull
    @Column(name="POINTS_POSSIBLE")
    private long pointsPossible;

    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Course assignmentCourse;

    public Assignment() {
    }

    public Assignment(@NotNull String assignmentName, String assignmentDescription, Set<Grade> grades, @NotNull long pointsPossible, Course assignmentClass) {
        this.assignmentName = assignmentName;
        this.assignmentDescription = assignmentDescription;
        this.grades = grades;
        this.pointsPossible = pointsPossible;
        this.assignmentCourse = assignmentClass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getAssignmentDescription() {
        return assignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        this.assignmentDescription = assignmentDescription;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    public long getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(long pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    public Course getCourse() {
        return assignmentCourse;
    }

    public void setCourse(Course course) {
        this.assignmentCourse = course;
    }
}