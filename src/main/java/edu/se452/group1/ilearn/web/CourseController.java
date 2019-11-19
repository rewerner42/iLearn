package edu.se452.group1.ilearn.web;

import edu.se452.group1.ilearn.data.entity.Course;
import edu.se452.group1.ilearn.data.entity.User;
import edu.se452.group1.ilearn.form.NewCourseForm;
import edu.se452.group1.ilearn.service.CourseService;
import edu.se452.group1.ilearn.service.TopicService;
import edu.se452.group1.ilearn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/section/")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private TopicService topicService;

    @Autowired
    private UserService userService;

    @RequestMapping("{id}")
    public String findTopicsFromCourseId(@PathVariable Course course, long id, Model model) {
        model.addAttribute("course", courseService.findById(id));
        model.addAttribute("topics", topicService.findByCourse(course));
        return "course";
    }

    @GetMapping(value = "new")
    public String getNewSectionForm(Model model) {
        model.addAttribute("newCourse", new NewCourseForm());
        return "new_course_form";
    }

    @RequestMapping(value = "new", method = RequestMethod.POST)
    public String processAndAddNewSection(@Valid @ModelAttribute("newCourse") NewCourseForm newCourse, BindingResult result) {

        if (result.hasErrors()) {
            return "new_course_form";
        }

        Course course = new Course();
        course.setName(newCourse.getName());
        course.setDescription(newCourse.getDescription());
        course = courseService.save(course);
        return "redirect:/course/" + course.getId();
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable int id,
                         RedirectAttributes model) {
        courseService.deleteById(id);

        model.addFlashAttribute("message", "section.successfully.deleted");
        return "redirect:/home";
    }

}
