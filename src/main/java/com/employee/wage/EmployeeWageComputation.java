package com.employee.wage;

public class EmployeeWageComputation
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Computation Problem" );
        final int FULL_TIME = 2;
        final int PART_TIME = 1;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 20;
        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++) {
            int workingHours = 0;
            int empType = (int) (Math.random() * 100) % 3;
            switch (empType) {
                case FULL_TIME:
                    System.out.println("Employee is Present Full time");
                    workingHours = 8;
                    break;
                case PART_TIME:
                    System.out.println("Employee is Present Part time");
                    workingHours = 4;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Employee Daily Wage is " + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for month is " + totalWage);
    }
}
