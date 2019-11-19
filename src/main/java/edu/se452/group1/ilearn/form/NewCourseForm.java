package edu.se452.group1.ilearn.form;

import edu.se452.group1.ilearn.data.entity.Teacher;

import javax.validation.constraints.Size;

public class NewCourseForm {
    @Size(min = 1, max = 50, message = "{Size.Course.type.validation}")
    private String name;

    @Size(max = 300)
    private String description;

    private Teacher teacher;

    public NewCourseForm() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
