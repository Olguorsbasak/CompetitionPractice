package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.QuestionGroupRepository;
import com.olgu.competitionpractice.repository.entitiy.QuestionGroup;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class QuestionGroupService extends ServiceManager<QuestionGroup,Long> {
    private final QuestionGroupRepository questionGroupRepository;

    public QuestionGroupService(QuestionGroupRepository questionGroupRepository){
        super(questionGroupRepository);
        this.questionGroupRepository=questionGroupRepository;

    }

}
