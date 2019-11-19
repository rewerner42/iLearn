package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="STUDENTS")
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="STUDENT_ID")
    private long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "student")
    private User user;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "student")
    private Set<Grade> studentGrades = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "studentCourses", joinColumns = { @JoinColumn(name = "student_id")}, inverseJoinColumns = {@JoinColumn(name="class_id")})
    private Set<Course> studentCourses = new HashSet<>();


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="PARENT_ID")
    private Set<Parent> parents = new HashSet<>();

    public Student() {
    }

    public Student(User user, String firstName, String lastName, Set<Grade> studentGrades, Set<Course> studentCourses, Set<Parent> parents) {
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentGrades = studentGrades;
        this.studentCourses = studentCourses;
        this.parents = parents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Grade> getStudentGrades() {
        return studentGrades;
    }

    public void setStudentGrades(Set<Grade> studentGrades) {
        this.studentGrades = studentGrades;
    }

    public Set<Course> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(Set<Course> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public Set<Parent> getParents() {
        return parents;
    }

    public void setParents(Set<Parent> parents) {
        this.parents = parents;
    }
}
