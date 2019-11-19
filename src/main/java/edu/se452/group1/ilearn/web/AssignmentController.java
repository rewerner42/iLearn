package edu.se452.group1.ilearn.web;

import edu.se452.group1.ilearn.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/assignment/")
public class AssignmentController {

    @Autowired
    AssignmentService assignmentService;

}
