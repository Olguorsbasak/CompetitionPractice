package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.State;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.List;

@Table(name = "tbl_compQuestion")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CompetitonQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long question_id;
    Long competiton_id;
    Long duration;
    @Enumerated(EnumType.STRING)
    /**  Enumtype string verildiğinde sayı olarak değil string olarak belirtilenler döner*/
    @Builder.Default
    State state= State.APPROVAL;
    @Embedded
    TableAdd tableAdd; /** Table add classında yazılanlar burada embedded anotasyonu ile çağrılır.  */
    @Transient /** Listenin veri tabanında görünmemesi için kullanılır.  */
    List<User> correctAnswers;
    @Transient
    List<User> wrongAnswers;


}
