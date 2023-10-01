package com.hackaton.creditservice.service;

import com.hackaton.creditservice.dto.request.CreditScoreFactorsRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditScoreFactors {
    private Character character;
    private Capacity capacity;
    private Capital capital;
    private Conditions conditions;
    private AdditionalFactors additionalFactors;

    public int getCreditRating(CreditScoreFactorsRequest creditScoreFactorsRequest) {
        return 0;
    }
}
