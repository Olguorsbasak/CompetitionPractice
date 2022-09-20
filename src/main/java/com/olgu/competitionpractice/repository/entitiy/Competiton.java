package com.olgu.competitionpractice.repository.entitiy;
import com.olgu.competitionpractice.repository.enums.CompetitonStatus;
import com.olgu.competitionpractice.repository.enums.State;
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

    Long competitonOwner_id;
    String competitonHeader;
    String competitonDes;
    String img;
    int numberofWinner;

    @Enumerated(EnumType.STRING)
    // buranın bu şekilde yazımı enum sınıfından aldığından buradaki yazılan şekliyle geri döndürür. Sayılar ile değil.
    @Builder.Default
    CompetitonStatus competitonStatus = CompetitonStatus.ACTIVE_PARTICIPATION_OPEN;
     @Enumerated(EnumType.STRING)
     @Builder.Default
     State state= State.PENDING_APPROVAL;
     @Embedded
     TableAdd tableAdd;
     @Transient
     List<Question> questionList;
    @Transient
    List<User> participationList;



}
