package com.employee.wage;

public class EmployeeWageComputation
{
    public static void calculateTotalWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        final int FULL_TIME = 2;
        final int PART_TIME = 1;
        int totalWage = 0;
        int workingHours = 0;

        System.out.println("Details of " + companyName + " employee");
        System.err.println("Wage per hour:" + wagePerHr);
        System.out.println("Maximum working days:" + maxWorkingDays);
        System.out.println("Maximum working hours:" + maxWorkingHrs);
        System.out.printf("%5s     %5s     %5s     %5s\n", "Day", "Workinghrs", "Wage", "Total working hrs");
        for (int day = 1, totalWorkingHrs = 0; day <= maxWorkingDays
                && totalWorkingHrs <= maxWorkingHrs; day++, totalWorkingHrs += workingHours)
        {

            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
                    workingHours = 0;
            }
            int wage = workingHours * wagePerHr;
            totalWage += wage;
            System.out.printf("%5d       %5d      %5d      %5d\n", day, workingHours, wage, totalWorkingHrs + workingHours);
        }
        System.out.println("Total wage for month is " + companyName + " employee is " + totalWage + "\n");
    }

    public static void main( String[] args ) {
        System.out.println("Welcome to Employee Wage Computation Problem");
        calculateTotalWage("Amazon", 20,16, 150);
        calculateTotalWage("Flipkart",40,20,100);
        calculateTotalWage("Nykaa",30,15,100);
    }
}