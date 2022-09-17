package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.CompetitonRepository;
import com.olgu.competitionpractice.repository.entitiy.Competiton;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.security.Provider;
@Service
public class CompetitonService extends ServiceManager<Competiton,Long> {
    private final CompetitonRepository competitonRepository;
    public CompetitonService(CompetitonRepository competitonRepository){
        super(competitonRepository);
        this.competitonRepository=competitonRepository;
    }

}
