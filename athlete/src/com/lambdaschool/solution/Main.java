package com.lambdaschool.solution;

public class Main
{
    public static void main(String[] args)
    {
        AthleteCreationInjector injector;
        Processor app;

        // Create a Track Athlete
        injector = new TrackAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Hockey Athlete
        injector = new HockeyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        // Create a Rugby Athlete
        injector = new RugbyAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();

        // Create a Baseball Athlete
        injector = new BaseballAthleteCreationInjector();
        app = injector.getProcess();
        app.displayAthlete();


        //Court Stretch goal

        CourtInjector courtInjector;
        CourtProcessor courtProcessor;
        
        //Print Baseball Court
        courtInjector = new BaseballCourtInjector();
        courtProcessor = courtInjector.getProcessor();
        courtProcessor.printCourt();
        
        //Print Track Court
        courtInjector = new TrackCourtInjector();
        courtProcessor = courtInjector.getProcessor();
        courtProcessor.printCourt();
        
        //Print Hockey Court
        courtInjector = new HockeyCourtInjector();
        courtProcessor = courtInjector.getProcessor();
        courtProcessor.printCourt();
        
        //Print Rugby Court
        courtInjector = new RugbyCourtInjector();
        courtProcessor = courtInjector.getProcessor();
        courtProcessor.printCourt();
    }
}
