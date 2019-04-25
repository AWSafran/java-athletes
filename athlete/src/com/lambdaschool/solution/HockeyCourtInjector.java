package com.lambdaschool.solution;

public class HockeyCourtInjector implements CourtInjector
{
    @Override
    public CourtProcessor getProcessor()
    {
        return new HockeyCourtProcessor();
    }
}
