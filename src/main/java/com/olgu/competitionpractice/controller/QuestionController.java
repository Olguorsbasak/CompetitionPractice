package com.olgu.competitionpractice.controller;

import com.olgu.competitionpractice.dto.request.AddQuestionRequestDto;
import com.olgu.competitionpractice.services.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/question")
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/addQues")
    public ModelAndView addQuestion(){
        ModelAndView model = new ModelAndView();
        model.addObject("userid",1);
        model.setViewName("soruolusturma");
        return model;
    }

    @CrossOrigin
    @PostMapping(value = "/addQues")
    public ModelAndView addQuestion(@RequestBody AddQuestionRequestDto dto){
        questionService.addQues(dto);
        return new ModelAndView("redirect:addQues");
    }


}
