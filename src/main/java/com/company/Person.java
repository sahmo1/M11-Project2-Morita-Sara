package com.company;

/*
* Person contains a name, their pay, and how much they've earned
* */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Person {
    String name;
    Integer income;
    Integer incomeEarned;

    public Person(String name, Integer income, Integer incomeEarned) {
        this.name = name;
        this.income = income;
        this.incomeEarned = incomeEarned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getIncomeEarned() {
        return incomeEarned;
    }

    public void setIncomeEarned(Integer incomeEarned) {
        this.incomeEarned = incomeEarned;
    }
}