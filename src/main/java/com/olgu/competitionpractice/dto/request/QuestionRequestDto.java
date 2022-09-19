package com.olgu.competitionpractice.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class QuestionRequestDto {
    private String questionContent;
    private int duration;
    private long creator_id;
    private int numberofAnswer;

}
