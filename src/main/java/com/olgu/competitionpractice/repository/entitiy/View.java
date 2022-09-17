package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name="tbl_view")
@Entity
public class View {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    Long user_id;
    Long question_id;
    Long date;
    @Enumerated(EnumType.STRING)
    State state;
    @Embedded
    TableAdd tableAdd;

}
