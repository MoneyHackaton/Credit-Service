package com.hackaton.creditservice.service;

import com.hackaton.creditservice.util.BankAccountActivityEnum;
import com.hackaton.creditservice.util.EducationLevelEnum;
import com.hackaton.creditservice.util.MaritalStatusEnum;
import com.hackaton.creditservice.util.PurposeOfLoanEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdditionalFactors implements Grade {
    private int creditRating;
    private int employmentHistory;
    private Map<EducationLevelEnum, Integer> educationLevel;
    private Map<MaritalStatusEnum, Integer> maritalStatus;
    private int residentialStability;
    private boolean incomeDiversity;
    private Map<PurposeOfLoanEnum, Integer> purposeOfLoan;
    private Map<BankAccountActivityEnum, Integer> bankAccountActivity;
    private double socialRating;

    @Override
    public double getGrade() {
        return 0;
    }
}
