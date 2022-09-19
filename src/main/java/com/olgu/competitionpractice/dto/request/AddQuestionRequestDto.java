package com.olgu.competitionpractice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AddQuestionRequestDto {
    private QuestionRequestDto question;
    private List<AnswerRequestDto> answers;
}
