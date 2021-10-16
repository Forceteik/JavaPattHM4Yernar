package com;

import com.toyfactory.BikeTeamFactory;

public class BMWBikeFactory {
    public static void main(String[] args) {
        WorkshopTeamFactory workshopTeamFactory = new BikeTeamFactory();
        Engineer engineer = workshopTeamFactory.getEngineer();
        Tester tester = workshopTeamFactory.getTester();
        WorkshopManager workshopManager = workshopTeamFactory.getWorkshopManager();

        System.out.println("Creating BMW bike...");
        engineer.doBike();
        tester.testBike();
        workshopManager.manageWorkshop();
    }
}
