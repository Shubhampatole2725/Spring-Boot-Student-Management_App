package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Student;
import com.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService service;


	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@RequestMapping("/")
	public String landingPage() {
		System.out.println("Inside Landing Page");
		return "index";
	}
	@RequestMapping("/log")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/reg")
	public String register() {
		return "register";
	}
	@RequestMapping("/register")
	public String registerStudent(@ModelAttribute Student student) {
		System.out.println(student.getRollno());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getContactNo());
		System.out.println(student.getEmail());
		System.out.println(student.getGender());
		service.saveStudent(student);
		return "index";
	}
	
	@RequestMapping("/login")
	public String loginCheck(String username, String password , Model model) {
		boolean flag = service.loginCheck(username, password);
		if(flag) {
			List<Student> list = service.getAllStudent();
			model.addAttribute("list",list);
			return "success";
		}
		return "index";
	}
	@RequestMapping("/delete")
	public String deleteData(@RequestParam int rollNo , Model model) {
		System.out.println("delete in Controller");
		List<Student> list = service.deleteStudent(rollNo);
		model.addAttribute("list", list);
		return "success";
	}
	@RequestMapping("/edit")
	public ModelAndView editData(@RequestParam int rollNo,ModelAndView model) {
		Student student = service.getStudent(rollNo);
		ModelAndView md = new ModelAndView();
		md.addObject("student", student);
		md.setViewName("update");
		return md;
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student student, Model model) {
		List<Student> list = service.updateStudent(student);
		model.addAttribute("list", list);
		return "success";
	}
}