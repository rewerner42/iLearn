package edu.se452.group1.ilearn.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CLASSES")
public class Classes {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="CLASS_ID")
    private long id;
    @Column(name="CLASS_NUM")
    private long classNum;
    @Column(name="SECTION_NUM")
    private long sectionNum;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getClassNum() {
        return classNum;
    }

    public void setClassNum(long classNum) {
        this.classNum = classNum;
    }

    public long getSectionNum() {
        return sectionNum;
    }

    public void setSectionNum(long sectionNum) {
        this.sectionNum = sectionNum;
    }
}
