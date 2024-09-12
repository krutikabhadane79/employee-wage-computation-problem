package com.employee.wage;

public interface IEmpwageBuilder {
    public void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs);

    public void calculateTotalWage();
}
