package com.hackaton.creditservice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Conditions implements Grade {
    private double inflationRate;

    @Override
    public double getGrade() {
        return 0;
    }
}
