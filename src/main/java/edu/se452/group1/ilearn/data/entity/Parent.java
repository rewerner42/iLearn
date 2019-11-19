package edu.se452.group1.ilearn.data.entity;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="PARENTS")
public class Parent {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="PARENT_ID")
    private long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "parent")
    private User user;

    @ManyToMany(mappedBy = "parents")
    private Set<Student> children;


    public Parent() {
    }

    public Parent(User user, Set<Student> children, String firstName1, String lastName1, String firstName2, String lastName2) {
        this.user = user;
        this.children = children;
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

    public Set<Student> getChildren() {
        return children;
    }

    public void setChildren(Set<Student> children) {
        this.children = children;
    }
}
