package com.company;

/*
* Actor extends from person
* Actor includes Role
* */
public class Actor extends Person {
    public String role;

    public Actor(String name, Integer income, Integer incomeEarned, String role) {
        super(name, income, incomeEarned);
        this.name = name;
        this.income = income;
        this.incomeEarned = incomeEarned;
        this.role = role;
    }

    public void setActor(String name, Integer income, Integer incomeEarned, String role) {
        this.name = name;
        this.income = income;
        this.incomeEarned = incomeEarned;
        this.role = role;
    }
}
