package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="USER_ID")
    private long id;

    @NotEmpty
    @Column(name="FIRST_NAME")
    private String firstName;

    @NotEmpty
    @Column(name="LAST_NAME")
    private String lastName;

    @NotEmpty
    @Column(name="EMAIL")
    private String email;

    @NotEmpty
    @Column(name="USERNAME")
    private String username;

    @NotEmpty
    @Size(min = 8)
    @Column(name="PASSWORD")
    private String password;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Parent parent;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Teacher teacher;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Student student;

    @NotEmpty
    @Column(name="STATE", nullable=false)
    private String state=State.ACTIVE.getState();

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_USER_PROFILE",
            joinColumns = { @JoinColumn(name = "USER_ID") },
            inverseJoinColumns = { @JoinColumn(name = "USER_PROFILE_ID") })
    private Set<UserProfile> userProfiles = new HashSet<UserProfile>();

    public User() {
    }

    public User(@NotEmpty String firstName, @NotEmpty String lastName, @NotEmpty String email, @NotEmpty String username, @NotEmpty @Size(min = 8) String password, Parent parent, Teacher teacher, Student student, @NotEmpty String state, Set<UserProfile> userProfiles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
        this.parent = parent;
        this.teacher = teacher;
        this.student = student;
        this.state = state;
        this.userProfiles = userProfiles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Set<UserProfile> getUserProfiles() {
        return userProfiles;
    }

    public void setUserProfiles(Set<UserProfile> userProfiles) {
        this.userProfiles = userProfiles;
    }
}
