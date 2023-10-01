package com.hackaton.creditservice.service;

import com.hackaton.creditservice.util.CollateralIndependenceEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Capital implements Grade {
    private int amount;
    private Map<CollateralIndependenceEnum, Integer> collateralIndependence;
    private int securitiesValue;
    private int savingsAmount;

    @Override
    public double getGrade() {
        return 0;
    }
}
