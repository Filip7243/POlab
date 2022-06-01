package com.Lab10;

public class Horror extends Film{

    private static final String type = "Horror";

    public Horror(int duration, boolean isWatched) {
        super(duration, isWatched);
    }

    @Override
    public String info() {
        return super.info() + " " + this.type;
    }
}
