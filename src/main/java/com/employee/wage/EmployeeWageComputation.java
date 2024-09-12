package com.employee.wage;

public class EmployeeWageComputation
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to Employee Wage Computation Problem" );
        final int FULL_TIME = 1;
        int empType = (int) (Math.random() * 100) % 2;
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }
    }
}
