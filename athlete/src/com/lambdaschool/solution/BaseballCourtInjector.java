package com.lambdaschool.solution;

public class BaseballCourtInjector implements CourtInjector
{
    @Override
    public CourtProcessor getProcessor() {
        return new BaseballCourtProcessor();
    }
}
