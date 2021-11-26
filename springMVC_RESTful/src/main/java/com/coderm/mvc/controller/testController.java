package com.coderm.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/toAdd")
    public String add() {
        return "employee_add";
    }
}
