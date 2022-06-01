package com.Lab10;

public class Film {

    private int duration;
    private boolean isWatched;

    public Film(int duration, boolean isWatched) {
        this.duration = duration;
        this.isWatched = isWatched;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isWatched() {
        return isWatched;
    }

    public void setWatched(boolean watched) {
        isWatched = watched;
    }

    public String info() {
        return "nr: " + this.duration + " czy obejrzany:" + this.isWatched;
    }

}
