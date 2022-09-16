package com.olgu.competitionpractice.repository.entitiy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbl_question")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String question;
    @OneToOne(mappedBy = "question")//bir sorununbir cevabı var
    Answer answer;


    @ManyToOne
    @JoinColumn(name = "question_creator", referencedColumnName = "id") //bir user birden fazla soru oluşturabilir.Join column.
    User questionCreator;

    @ManyToOne
    @JoinColumn(name = "competiton", referencedColumnName = "id")
    Competiton competition;//yarışmaya ait bir çok soru var.JoınColumn

}
