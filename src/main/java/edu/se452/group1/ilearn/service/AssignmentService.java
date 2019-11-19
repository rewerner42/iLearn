package edu.se452.group1.ilearn.service;


import edu.se452.group1.ilearn.data.entity.Assignment;
import edu.se452.group1.ilearn.data.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/assignment/")
public class AssignmentService {
    @Autowired
    AssignmentRepository assignmentRepository;

    public Assignment findById(long id) { return assignmentRepository.findById(id);}

    List<Assignment> findAllByCourseId(long id) { return assignmentRepository.findAllByAssignmentCourseId(id);}

    Assignment save(Assignment assignment) {
        return assignmentRepository.save(assignment);
    }

    void deleteById(long id) {
        assignmentRepository.deleteById(id);
    }
}