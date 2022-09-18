package com.olgu.competitionpractice.repository;

import com.olgu.competitionpractice.repository.entitiy.View;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewRepository extends JpaRepository <View,Long>{
}
