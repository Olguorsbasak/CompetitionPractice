package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationRepository extends JpaRepository <Participation,Long> {
}
