package com.company;

/*
* needs to contain all properties, method for calculating profit,
* pays all actors and crew and adds to money spent
* */

import java.util.ArrayList;

public class Movie {

    //properties
    private String Genre;
    private Director director;
    private ArrayList<Actor> Actors ;
    private ArrayList<Crew> Crew ;
    private double Budget;
    private double MoneySpend;
    private double MoneyEarned;
    private double Profit ;

    public Movie(String Genre, Director director, ArrayList<Actor> Actors, ArrayList<Crew> Crew, double Budget) {
        this.Genre = Genre;
        this.director = director;
        this.Actors = Actors;
        this.Crew = Crew;
        this.Budget = Budget;
        this.MoneySpend = 0;
        this.MoneyEarned = 0;
        this.Profit = 0;
    }

    public void setMoneySpend(double moneySpend) {
        MoneySpend = moneySpend;
    }

    public double getMoneySpend() {
        return MoneySpend;
    }

    public void updateMoneyEarned(double MoneyEarned){
        this.MoneyEarned = MoneyEarned;
        //System.out.println("profit $ " + getProfit(MoneyEarned));
    }

    //pays actors, crew, and adds to money earned
    public void PayDay() {
        // Calculate for each actor
        for (Actor actor : Actors) {
            MoneyEarned += actor.getIncomeEarned();
        }
        // Calculate for each crew
        for (Crew crew : Crew) {
            MoneyEarned += crew.getIncomeEarned();
        }

        MoneyEarned += director.getIncomeEarned();

        System.out.println(this.MoneyEarned);
    }

    public double getBudget() {
        return Budget;
    }

    // Calculate the profit of the movie
    public double getProfit(double MoneyEarned) {
        this.Profit += (this.Budget - this.MoneySpend)  + MoneyEarned;

        System.out.println("Movie's profit $ " + this.Profit);
        return Profit;

    }

}
