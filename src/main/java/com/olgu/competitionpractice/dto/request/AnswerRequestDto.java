package com.olgu.competitionpractice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class AnswerRequestDto {
    private String answerContent;
    private boolean isAnswerTrue;


}
