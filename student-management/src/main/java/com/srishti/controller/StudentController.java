package com.srishti.controller;

import com.srishti.model.Student;
import com.srishti.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }



    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        System.out.println("🟢 Endpoint hit: /showNewStudentForm — Returning view: new_student");
        Student student = new Student();
        model.addAttribute("student", student);
        return "new_student";
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "update_student";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") long id) {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}
