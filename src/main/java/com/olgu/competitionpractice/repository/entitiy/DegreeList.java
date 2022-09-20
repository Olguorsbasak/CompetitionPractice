package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbl_degree")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class DegreeList {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    Long user_id;
    Long competiton_id;
    int point;
    int sequence;
    @Enumerated
    @Builder.Default
    State state = State.APPROVAL;
    @Embedded
    TableAdd tableAdd;


}
