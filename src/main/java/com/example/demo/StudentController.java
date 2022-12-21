package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class StudentController {

    @GetMapping("/findStudent/{id}")
    public String getStudent(@PathVariable String id) {

        return "";
    }

}
