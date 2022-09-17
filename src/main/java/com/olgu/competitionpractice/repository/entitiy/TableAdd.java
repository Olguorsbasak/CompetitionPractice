package com.olgu.competitionpractice.repository.entitiy;

import com.olgu.competitionpractice.repository.enums.State;

import javax.persistence.Embeddable;

@Embeddable
public class TableAdd {
    State state;
    long createDate;
    long updateDate;
}
