package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.CompetitonQuestionRepository;
import com.olgu.competitionpractice.repository.entitiy.CompetitonQuestion;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class CompetitonQuestionService extends ServiceManager<CompetitonQuestion,Long> {
    private final CompetitonQuestionRepository competitonQuestionRepository;

    public CompetitonQuestionService(CompetitonQuestionRepository competitonQuestionRepository){
        super(competitonQuestionRepository);
        this.competitonQuestionRepository=competitonQuestionRepository;
    }


}
