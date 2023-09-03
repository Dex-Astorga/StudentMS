package tech.dexdev.studentms.StudentController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.dexdev.studentms.Student.Student;
import tech.dexdev.studentms.StudentService.StudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String findAll(Model model) {
        model.addAttribute("studentsList", service.findAll());
        return "index";
    }

//    THIS WILL RETURN A FORM HTML
    @GetMapping("/new")
    public String createStudentRender(Model model) {
        Student student = new Student();
        model.addAttribute("studentNew", student);
        return "create_student";
    }

    @PostMapping("/")
    public String save(@ModelAttribute("studentNew") Student student) {
        service.save(student);
        return "redirect:/students/";
    }

}
