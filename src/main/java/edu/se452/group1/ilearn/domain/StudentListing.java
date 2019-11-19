package edu.se452.group1.ilearn.domain;

public class StudentListing{
    private long studentID;
    private String firstName;
    private String lastName;
    private int classNum;

    public long getStudentID() {
        return this.studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getClassNum() {
        return this.classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    
}