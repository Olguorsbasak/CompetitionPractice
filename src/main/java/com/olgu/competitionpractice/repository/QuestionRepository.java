package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
}
