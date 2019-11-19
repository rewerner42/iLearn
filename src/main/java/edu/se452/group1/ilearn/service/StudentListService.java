package edu.se452.group1.ilearn.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.se452.group1.ilearn.data.entity.Student;
import edu.se452.group1.ilearn.data.repository.StudentRepository;
import edu.se452.group1.ilearn.domain.StudentListing;

@Service
public class StudentListService{
    private final StudentRepository studentRepo;

    @Autowired
    public StudentListService(StudentRepository studentRepo) {
        this.studentRepo = studentRepo;
    }
    
    public List<StudentListing> getStudentsWithLastName(String lastName){
        Iterable<Student> students = this.studentRepo.findAll();
        Map<Long, StudentListing> studentListingMap = new HashMap<>();
        students.forEach(student ->{
            StudentListing studListing = new StudentListing();
            studListing.setFirstName(student.getFirstName());
            studListing.setLastName(student.getLastName());
            studListing.setStudentID(student.getId());
            studentListingMap.put(student.getId(), studListing);
        });
        List<StudentListing> allStudents = new ArrayList<>();
        for (Long studentID:studentListingMap.keySet()){
            allStudents.add(studentListingMap.get(studentID));
        }
        return allStudents;
    }

}