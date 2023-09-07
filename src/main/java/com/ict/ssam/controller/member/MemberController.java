package com.ict.ssam.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {

    @GetMapping("/")
    public ModelAndView getHelloController(){
        ModelAndView mv = new ModelAndView("index");
        String msg = "Hello Springboot MVC";
        System.out.println("msg : " + msg);
        mv.addObject("msg", msg);
        return mv;
    }
}
