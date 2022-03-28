package com.company;

import java.util.ArrayList;

public class Main {


    /*
     * print how much PA earned
     * print how much movie spent of its budget
     * how much movie profited
     * how much director made from royalty
     * */

    public static void main(String[] args) {
        // Instantiate the Person; Crew; Actor; PA; Director; Movie

        Person person = new Person("Jane Doe", 0, 1500);
        Crew crew = new Crew("John Doe", 0, 3000, "Art Department");
        Actor actor = new Actor("Tom Holland", 0, 10000, "Spider-Man");
        PA pa = new PA("Sara Morita", 25, 0, 200, "Camera Department");
        Director director = new Director("Jon Watts", 0, 20000, 0, "Camera Department");
        Movie movie = new Movie("Action", director, new ArrayList<Actor>(), new ArrayList<Crew>(), 100000);

        //print how much PA earned
        System.out.println("PA earned $ "+ pa.incomeEarned);

        //print out movie's budget
        System.out.println("Movie's budget $ "+ movie.getBudget());

        //print profit here
        movie.getProfit(100000);

        //how much director made from royalty
        System.out.println("The director's royalty was $ "+ director.getRoyalty());

    }

}


