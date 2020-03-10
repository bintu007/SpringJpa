
package com.demo.SpringJpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClassController 
{

    @RequestMapping("/")
    public String home()
{
return "home.jsp";
}
    
}
