package com.olgu.competitionpractice.repository.entitiy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "tbl_user")
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column( name = "name", length = 300)
    String name;
    @Column( name = "lname", length = 300)
    String lName;
    @Column( name = "password", length = 10)
    String password;
    @Enumerated(EnumType.STRING)
    UserRole userRole;
    @OneToMany(mappedBy = "questionCreator")
    List<Question> questionList; //bir user birden fazla soru oluşturabilir
    @ManyToOne
    @JoinColumn(name = "competiton", referencedColumnName = "id")
    Competiton competition;

}