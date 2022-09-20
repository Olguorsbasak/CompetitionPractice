package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbl_questionGroup")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class QuestionGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String group_id;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    State state = State.APPROVAL;
    @Embedded
    TableAdd tableAdd;



}
