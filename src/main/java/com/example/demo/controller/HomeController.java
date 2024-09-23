package com.example.demo.controller;

import java.net.http.HttpRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
      
    @GetMapping("/home")
    public String goHome(){
     System.out.println("its working");
     return "index";
    }

    @GetMapping("/add")
    public String goResult(HttpServletRequest req, HttpSession session){
        int a = Integer.parseInt(req.getParameter("num1"));
        int b = Integer.parseInt(req.getParameter("num2"));
        int c =  a + b;
        session.setAttribute("result", c);
        System.out.println("Result " + c);
        return "result";
    }

}
