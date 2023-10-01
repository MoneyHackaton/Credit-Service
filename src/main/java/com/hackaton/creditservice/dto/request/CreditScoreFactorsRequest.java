package com.hackaton.creditservice.dto.request;

import com.hackaton.creditservice.service.AdditionalFactors;
import com.hackaton.creditservice.service.Capacity;
import com.hackaton.creditservice.service.Capital;
import com.hackaton.creditservice.service.Conditions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditScoreFactorsRequest {
    private Character character;
    private Capacity capacity;
    private Capital capital;
    private Conditions conditions;
    private AdditionalFactors additionalFactors;
}
