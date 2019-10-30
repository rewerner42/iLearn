package edu.se452.group1.ilearn.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="PARENTS")
public class Parent {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="PARENT_ID")
    private long id;
    @Column(name="CHILD_ID_1")
    private long childId1;
    @Column(name="CHILD_ID_2")
    private long childId2;
    @Column(name="CHILD_ID_3")
    private long childId3;
    @Column(name="CHILD_ID_4")
    private long childId4;
    @Column(name="CHILD_ID_5")
    private long childId5;
    @Column(name="FIRST_NAME_1")
    private String firstName1;
    @Column(name="LAST_NAME_1")
    private String lastName1;
    @Column(name="FIRST_NAME_2")
    private String firstName2;
    @Column(name="LAST_NAME_2")
    private String lastName2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getChildId1() {
        return childId1;
    }

    public void setChildId1(long childId1) {
        this.childId1 = childId1;
    }

    public long getChildId2() {
        return childId2;
    }

    public void setChildId2(long childId2) {
        this.childId2 = childId2;
    }

    public long getChildId3() {
        return childId3;
    }

    public void setChildId3(long childId3) {
        this.childId3 = childId3;
    }

    public long getChildId4() {
        return childId4;
    }

    public void setChildId4(long childId4) {
        this.childId4 = childId4;
    }

    public long getChildId5() {
        return childId5;
    }

    public void setChildId5(long childId5) {
        this.childId5 = childId5;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getFirstName2() {
        return firstName2;
    }

    public void setFirstName2(String firstName2) {
        this.firstName2 = firstName2;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }
}
