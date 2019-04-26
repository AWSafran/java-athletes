package com.lambdaschool.solution;

import javax.sound.midi.Track;

public class TrackCourtInjector implements CourtInjector
{
    @Override
    public CourtProcessor getProcessor()
    {
        return new TrackCourtProcessor();
    }
}
