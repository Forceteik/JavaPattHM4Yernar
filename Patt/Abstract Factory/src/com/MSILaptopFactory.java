package com;

import com.technicalfactory.LaptopTeamFactory;

public class MSILaptopFactory {
    public static void main(String[] args) {
        WorkshopTeamFactory workshopTeamFactory = new LaptopTeamFactory();
        Engineer engineer = workshopTeamFactory.getEngineer();
        Tester tester = workshopTeamFactory.getTester();
        WorkshopManager workshopManager = workshopTeamFactory.getWorkshopManager();

        System.out.println("Creating MSI laptop...");
        engineer.doBike();
        tester.testBike();
        workshopManager.manageWorkshop();
    }
}
