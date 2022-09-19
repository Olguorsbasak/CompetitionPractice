package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.dto.request.AddQuestionRequestDto;
import com.olgu.competitionpractice.repository.QuestionRepository;
import com.olgu.competitionpractice.repository.entitiy.Question;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class QuestionService extends ServiceManager <Question,Long>{
    private final QuestionRepository questionRepository;
    private final AnswerService answerService;
    public QuestionService(QuestionRepository questionRepository, AnswerService answerService) {
        super(questionRepository);
        this.questionRepository = questionRepository;
        this.answerService = answerService;
    }

    public void addQues(AddQuestionRequestDto dto){
        /**
         * Soruyu kayıt ediyor.
         */
        Question question= save(Question.builder()
                .question(dto.getQuestion().getQuestionContent())
                .numberofAnswer(dto.getQuestion().getNumberofAnswer())
                .duration(dto.getQuestion().getDuration())
                .owner_id(dto.getQuestion().getCreator_id())
                .build());
        /**
         * cevapları kayıt etmeniz gerekli.
         * 1. cevap kayıt edebnilmeniz için soru idsine ihtiyaç var
         * 2. bir sorunun en az 2 cevabı(şıkkı) olmalı
         */
        answerService.addAnswerofQuestion(dto.getAnswers(),question.getId());
    }

}
