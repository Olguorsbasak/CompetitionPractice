package com.olgu.competitionpractice.controller;

import com.olgu.competitionpractice.dto.request.DoLoginDto;
import com.olgu.competitionpractice.repository.entitiy.User;
import com.olgu.competitionpractice.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("")

public class LoginController {

    private final UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

    @PostMapping("/login")
    public ModelAndView login(DoLoginDto doLoginDto){
        Optional<User> userOptional =  userService.doLogin(doLoginDto);
        ModelAndView modelAndView = new ModelAndView();
        if(userOptional.isEmpty()){
            modelAndView.addObject("error","Username or password wrong!");
            modelAndView.setViewName("login");
        }else{
            modelAndView.addObject("user",userOptional.get());
            modelAndView.setViewName("user");
        }
        return modelAndView;
    }
}

