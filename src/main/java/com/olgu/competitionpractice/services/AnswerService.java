package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.dto.request.AnswerRequestDto;
import com.olgu.competitionpractice.repository.AnswerRepository;
import com.olgu.competitionpractice.repository.entitiy.Answer;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AnswerService extends ServiceManager<Answer,Long> {
    private final AnswerRepository answerRepository;

    public AnswerService(AnswerRepository answerRepository){
        super(answerRepository);
        this.answerRepository=answerRepository;
    }
    public void addAnswerofQuestion(List<AnswerRequestDto> dto, Long questionId){
        dto.forEach(answer->{
            save(Answer.builder()
                    .question_id(questionId)
                    .isTrue(answer.isTrue())
                    .answer(answer.getQuestionContent())
                    .build());
        });
    }


}
