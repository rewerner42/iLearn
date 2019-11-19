package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;


@Entity
@Table(name="GRADES")
public class Grade {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="GRADE_ID")
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ASSIGNMENT_ID")
    private Assignment gradeAssignment;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Student student;

    @Column(name="POINTS_GIVEN")
    private long pointsGiven;

    @Column(name="LETTER_GRADE")
    private String letterGrade;

    @Column(name="FEEDBACK")
    private String feedback;

    public Grade() {
    }

    public Grade(Assignment gradeAssignment, Student student, long pointsGiven, String letterGrade, String feedback) {
        this.gradeAssignment = gradeAssignment;
        this.student = student;
        this.pointsGiven = pointsGiven;
        this.letterGrade = letterGrade;
        this.feedback = feedback;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Assignment getGradeAssignment() {
        return gradeAssignment;
    }

    public void setGradeAssignment(Assignment gradeAssignment) {
        this.gradeAssignment = gradeAssignment;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
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
