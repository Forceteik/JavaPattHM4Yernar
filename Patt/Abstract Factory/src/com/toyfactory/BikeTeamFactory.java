package com.toyfactory;

import com.Engineer;
import com.Tester;
import com.WorkshopManager;
import com.WorkshopTeamFactory;

public class BikeTeamFactory implements WorkshopTeamFactory {
    @Override
    public Engineer getEngineer() {
        return new BikeEngineer();
    }

    @Override
    public Tester getTester() {
        return new BikeTester();
    }

    @Override
    public WorkshopManager getWorkshopManager() {
        return new BikeWorkshopManager();
    }
}
