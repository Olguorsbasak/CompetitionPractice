package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.AnswerRepository;
import com.olgu.competitionpractice.repository.DegreeListRepository;
import com.olgu.competitionpractice.repository.entitiy.DegreeList;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class DegreeListService extends ServiceManager<DegreeList,Long> {

    private final DegreeListRepository degreeListRepository;

    public DegreeListService(DegreeListRepository degreeListRepository){
        super(degreeListRepository);
        this.degreeListRepository=degreeListRepository;
    }
}
