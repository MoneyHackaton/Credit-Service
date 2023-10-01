package com.hackaton.creditservice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Сharacter implements Grade {
    private double percentageOfGoodCreditHistory;

    @Override
    public double getGrade() {
        if (percentageOfGoodCreditHistory > 0.9) {
            return 0.1;
        } else if (percentageOfGoodCreditHistory > 0.6) {
            return 0.06;
        } else if (percentageOfGoodCreditHistory > 3.0) {
            return 0.04;
        }
        return 0;
    }
}

