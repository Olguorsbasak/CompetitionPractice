package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.QuestionGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionGroupRepository extends JpaRepository<QuestionGroup,Long> {

}
