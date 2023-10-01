package com.hackaton.creditservice.controller;

import com.hackaton.creditservice.dto.request.CreditScoreFactorsRequest;
import com.hackaton.creditservice.dto.response.CreditScoreFactorsResponse;
import com.hackaton.creditservice.service.CreditScoreFactors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/credit-rating")
public class CreditScoreFactorsController {
    CreditScoreFactors creditScoreFactors;

    @GetMapping
    // todo исправить
    public int getCreditRating(@RequestBody CreditScoreFactorsRequest creditScoreFactorsRequest) {
        return creditScoreFactors.getCreditRating(creditScoreFactorsRequest);
    }
}
