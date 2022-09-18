package com.olgu.competitionpractice.repository.entitiy;


import com.olgu.competitionpractice.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Table(name = "tbl_answer")
    @Entity
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    @Builder
    public class Answer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        Long question_id;
        @Column(length = 1000)
        String answer;
        boolean isTrue;
        @Enumerated(EnumType.STRING)
        State state = State.APPROVAL;
        @Embedded
        TableAdd tableAdd;


}
