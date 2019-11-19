package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="TEACHERS")
public class Teacher {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="TEACHER_ID")
    private long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "teacher")
    private User user;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "courseTeacher")
    private Set<Course> courses = new HashSet<>();

    public Teacher() {
    }

    public Teacher(User user, String firstName, String lastName, Set<Course> courses) {
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = courses;
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

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
