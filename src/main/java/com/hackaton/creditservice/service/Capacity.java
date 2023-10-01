package com.hackaton.creditservice.service;

import com.hackaton.creditservice.util.CapacityLevelEnum;
import com.hackaton.creditservice.util.EmploymentTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Capacity  implements Grade {
    private CapacityLevelEnum level;
    private Map<EmploymentTypeEnum, Integer> employmentType;
    private int monthlyDebt;

    public Capacity(CapacityLevelEnum level, Map<EmploymentTypeEnum, Integer> employmentType, int monthlyDebt) {
        this.level = level;
        this.employmentType = employmentType;
        this.monthlyDebt = monthlyDebt;
    }

    @Override
    public double getGrade() {
        return 0;
    }
}
