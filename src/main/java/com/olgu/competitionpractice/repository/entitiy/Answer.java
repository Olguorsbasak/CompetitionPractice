package com.olgu.competitionpractice.repository.entitiy;


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
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        Long id;
        String answer;
        @OneToOne
        @JoinColumn(name = "question", referencedColumnName = "id") //her sorunun bir cevabı var.
                                                                    //OneToOne(joincolumn yada mapped by)
        Question question;

        @OneToOne (mappedBy = "answer") //diğer kullanımda bu şekilde
        Competiton competiton;
}
