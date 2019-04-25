package com.lambdaschool.solution;

public class TrackAthleteCreationInjector implements AthleteCreationInjector{
    //getProcess() should return a processor that displays track athlete


    @Override
    public Processor getProcess() {
        return new TrackAthleteProcesssor();
    }
}
