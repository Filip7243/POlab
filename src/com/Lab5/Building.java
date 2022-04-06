package com.Lab5;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Building {

    private String buildingName;
    private int yearOfBuild;
    private int levels;

    public Building(String buildingName, int yearOfBuild, int levels) {
        this.buildingName = buildingName;
        this.yearOfBuild = yearOfBuild;
        this.levels = levels;
    }

    public void printInfo() {
        System.out.println("Name = " + this.buildingName + "" +
                " Year of build = " + this.yearOfBuild + "" +
                " Levels = " + this.levels);
    }

    public int getBuildingAge() {
        return LocalDateTime.now().getYear() - this.yearOfBuild;
    }
}
