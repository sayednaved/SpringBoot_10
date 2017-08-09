package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("/")
    public String listJobs(Model model){
        model.addAttribute("courses", courseRepository.findAll());
        return "list";
    }
}
