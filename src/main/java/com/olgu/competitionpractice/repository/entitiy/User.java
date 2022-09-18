package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.UserRole;
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
    String username;
    String password;
    String nameSurname;
    @Enumerated(EnumType.STRING)
    UserRole userRole= UserRole.USER;
    @Embedded
    TableAdd tableAdd;



}