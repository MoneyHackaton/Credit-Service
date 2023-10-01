package com.hackaton.creditservice.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditScoreWeights {
    private Map<String, Double> weights;
    private CreditScoreFactors factors;

}
