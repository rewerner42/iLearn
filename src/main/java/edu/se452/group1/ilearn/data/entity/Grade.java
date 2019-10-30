package edu.se452.group1.ilearn.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="GRADES")
public class Grade {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="GRADE_ID")
    private long id;
    @Column(name="ASSIGNMENT_ID")
    private long assignmentName;
    @Column(name="STUDENT_ID")
    private long studentId;
    @Column(name="POINTS_GIVEN")
    private long pointsGiven;
    @Column(name="LETTER_GRADE")
    private String letterGrade;
    @Column(name="FEEDBACK")
    private String feedback;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(long assignmentName) {
        this.assignmentName = assignmentName;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public long getPointsGiven() {
        return pointsGiven;
    }

    public void setPointsGiven(long pointsGiven) {
        this.pointsGiven = pointsGiven;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
