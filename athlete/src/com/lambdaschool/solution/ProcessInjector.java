package com.lambdaschool.solution;

public interface ProcessInjector
{
    //All injectors must have a getProcess() method that returns a processor
    public Processor getProcess();
}
