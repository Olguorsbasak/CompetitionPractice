package com.olgu.competitionpractice.services;

import com.olgu.competitionpractice.repository.ParticipationRepository;
import com.olgu.competitionpractice.repository.entitiy.Participation;
import com.olgu.competitionpractice.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class ParticipationService extends ServiceManager<Participation,Long> {
    private final ParticipationRepository participationRepository;

    public ParticipationService(ParticipationRepository participationRepository){
        super(participationRepository);
        this.participationRepository=participationRepository;

    }
}
