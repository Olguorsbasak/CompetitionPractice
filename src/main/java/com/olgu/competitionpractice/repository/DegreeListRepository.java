package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.DegreeList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DegreeListRepository extends JpaRepository <DegreeList,Long>{
}
