package com.olgu.competitionpractice.repository.entitiy;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "tbl_competiton")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Competiton {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "competiton") //OneToMany-> mappedBy ve list döndürmeli
    List <User> userList;


    @OneToMany (mappedBy = "question")
    List<Question> questionList;

    @OneToMany (mappedBy = "answer")
    List<Answer> answerList;

    @OneToOne
    @JoinColumn(name = "answer", referencedColumnName = "answer") //bir yarışmanın bir cevabı var.
    Answer answer;
}
