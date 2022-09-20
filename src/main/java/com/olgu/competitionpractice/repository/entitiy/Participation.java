package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.CompetitonStatus;
import com.olgu.competitionpractice.repository.enums.ParticipationStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tbl_participation")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Participation {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    Long user_id;
    Long competiton_id;
    Long date;
    @Enumerated(EnumType.STRING)
    @Builder.Default
    ParticipationStatus participationStatus=ParticipationStatus.UNAPPROVED;
    @Embedded
    TableAdd tableAdd;

}
