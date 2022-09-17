package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.ViewRepository;
import com.olgu.competitionpractice.repository.entitiy.View;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ViewService extends ServiceManager<View,Long> {

    private final ViewRepository viewRepository;

    public ViewService(ViewRepository viewRepository){
        super(viewRepository);
        this.viewRepository=viewRepository;

    }

}
