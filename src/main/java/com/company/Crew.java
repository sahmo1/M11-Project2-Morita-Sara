package com.company;


/*
 * Crew extends from person
 * includes department
 * a name, how much they are paid, and how much they have earned.
 *
 * */
public class Crew extends Person {
    public String department;

    public Crew(String name, Integer income, Integer incomeEarned, String department) {
        super(name, income, incomeEarned);
        this.name = name;
        this.income = income;
        this.incomeEarned = incomeEarned;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }


}