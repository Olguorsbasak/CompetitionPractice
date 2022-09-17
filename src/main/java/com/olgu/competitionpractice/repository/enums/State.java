package com.olgu.competitionpractice.repository.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum State {
        PASSIVE(0),
        PENDING_APPROVAL(1),
        APPROVAL(2),
        DELETED(3),
        BLOCK(4);
        private int value;

    }

