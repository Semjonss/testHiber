package institute.controller;

import institute.entity.Student;
import institute.service.StudentService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;


@Controller
public class MainController {

    protected static Logger logger = Logger.getLogger("controller");

    @Resource(name = "studentService")
    private StudentService studentService;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getStudents(Model model) {

        logger.debug("Received request to show all students");

        final List<Student> students = studentService.getAll();
        model.addAttribute("students", students);

        logger.debug("Received request to show all students");
        final List<Object> studentsWithStipend = studentService.getStudentsWithStipend();
        model.addAttribute("studentsWithStipend", studentsWithStipend);
        return "studentspage";
    }
}