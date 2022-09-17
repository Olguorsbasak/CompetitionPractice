package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.QuestionRepository;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class QuestionService extends ServiceManager <QuestionService,Long>{
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        super(questionRepository);
        this.questionRepository=questionRepository;
    }

}
