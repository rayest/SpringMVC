package cn.rayest.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/8/9 0009.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    private static List<Student> students = new ArrayList<Student>();

    static {
        students.add(new Student(1, "Pay", 18));
        students.add(new Student(2, "Ray", 20));
        students.add(new Student(3, "Candy", 19));
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("students", students);
        mav.setViewName("student/list");
        return mav;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam(value = "id", required = false) String id) {
        ModelAndView mav = new ModelAndView();
        if (id != null) {
            mav.addObject("student", students.get(Integer.parseInt(id) - 1));
            mav.setViewName("student/update");
        } else {
            mav.setViewName("student/add");
        }

        return mav;
    }

    @RequestMapping("/save")
    public String save(Student student) {
        if (student.getId() != 0) {
            Student s = students.get(student.getId() - 1);
            s.setName(student.getName());
            s.setAge(student.getAge());
        } else {
            students.add(student);
        }
        return "redirect:/student/list";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("id") int id){
        students.remove(id - 1);
        return "redirect:/student/list";
    }
}
