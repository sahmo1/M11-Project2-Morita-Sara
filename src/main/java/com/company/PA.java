package com.company;


// PA earn pay based on hours worked

public class PA extends Crew{

    public Integer workingHours;

    public PA(String name, Integer income, Integer incomeEarned, Integer workingHours, String department) {
        super(name, income, incomeEarned, department);

        //PA income earned
        this.incomeEarned = workingHours * income;

    }



}
