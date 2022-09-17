package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.Competiton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitonRepository extends JpaRepository <Competiton,Long>{
}
