package com.olgu.competitionpractice.repository.entitiy;
import com.olgu.competitionpractice.repository.enums.State;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(length=1000)
    String question;
    Long duration;
    Long owner_id;
    int numberofAnswer;
    String groupName;
    @Enumerated(EnumType.STRING)
    State state = State.PENDING_APPROVAL;

    @Embedded
    TableAdd tableAdd;

    @OneToOne(mappedBy = "question")//bir sorunun bir cevabı var
    Answer answer;


    @ManyToOne
    @JoinColumn(name = "question_creator", referencedColumnName = "id") //bir user birden fazla soru oluşturabilir.Join column.
    User questionCreator;

    @ManyToOne
    @JoinColumn(name = "competiton", referencedColumnName = "id")
    Competiton competition;//yarışmaya ait bir çok soru var.JoınColumn






}
