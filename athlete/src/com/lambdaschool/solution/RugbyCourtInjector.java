package com.lambdaschool.solution;

public class RugbyCourtInjector implements CourtInjector
{
    @Override
    public CourtProcessor getProcessor()
    {
        return new RugbyCourtProcessor();
    }
}
