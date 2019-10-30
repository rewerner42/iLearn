package edu.se452.group1.ilearn.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ASSIGNMENT")
public class Assignment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ASSIGNMENT_ID")
    private long id;
    @Column(name="ASSIGNMENT_NAME")
    private String assignmentName;
    @Column(name="POINTS_POSSIBLE")
    private long pointsPossible;
    @Column(name="CLASS_NUM")
    private long classNum;

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

    public long getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(long pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    public long getClassNum() {
        return classNum;
    }

    public void setClassNum(long classNum) {
        this.classNum = classNum;
    }
}
