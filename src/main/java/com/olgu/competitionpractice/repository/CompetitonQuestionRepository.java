package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.CompetitonQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitonQuestionRepository extends JpaRepository<CompetitonQuestion,Long> {
}
