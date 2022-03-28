package com.company;

/*
*
* include a method for rewarding 1% royalty based on Movie Profit
* */

import java.sql.SQLOutput;

public class Director extends Crew{
    public float royalty;
    private Float royaltyPercentage = 0.01f;

    public Director(String name, Integer income, Integer incomeEarned, Integer royalty, String department) {
        super(name, income, incomeEarned, department);
    }

    public float getRoyalty() {

        royalty = royaltyPercentage * incomeEarned;

        return royalty;
    }
    
        
}
