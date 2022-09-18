package com.olgu.competitionpractice.controller;

import com.olgu.competitionpractice.dto.request.DoLoginRequestDto;
import com.olgu.competitionpractice.dto.request.RegisterRequestDto;
import com.olgu.competitionpractice.repository.entitiy.User;
import com.olgu.competitionpractice.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class LoginController {
    private final UserService userService;

    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login");
    }

    @GetMapping("/register")
    public ModelAndView register(){
        return new ModelAndView("register");
    }

    @PostMapping("/register")
    public ModelAndView register(RegisterRequestDto dto){
        boolean isregister = userService.register(dto);
        ModelAndView model = new ModelAndView();
        if(isregister){
            model.setViewName("redirect:/login");
        }else{
            model.addObject("error",
                    "Username already taken");
            model.setViewName("register");
        }
        return model;
    }

    @PostMapping("/login")
    public ModelAndView login(DoLoginRequestDto doLoginRequestDto){
        Optional<User> userOptional =  userService.doLogin(doLoginRequestDto);
        ModelAndView modelAndView = new ModelAndView();
        if(userOptional.isEmpty()){
            modelAndView.addObject("error","Wrong data");
            modelAndView.setViewName("login");
        }else{
            modelAndView.addObject("user",userOptional.get());
            modelAndView.setViewName("user");
        }
        return modelAndView;
    }
}

