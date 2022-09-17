package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.AnswerRepository;
import com.olgu.competitionpractice.repository.entitiy.Answer;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;


@Service
public class AnswerService extends ServiceManager<Answer,Long> {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository){
        super(answerRepository);
        this.answerRepository=answerRepository;
    }
}
