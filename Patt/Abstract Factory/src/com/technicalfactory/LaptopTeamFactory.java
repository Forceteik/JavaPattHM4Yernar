package com.technicalfactory;

import com.Engineer;
import com.Tester;
import com.WorkshopManager;
import com.WorkshopTeamFactory;
import com.toyfactory.BikeTester;

public class LaptopTeamFactory implements WorkshopTeamFactory {
    @Override
    public Engineer getEngineer() {
        return new LaptopEngineer();
    }

    @Override
    public Tester getTester() {
        return new LaptopTester();
    }

    @Override
    public WorkshopManager getWorkshopManager() {
        return new LaptopFactoryM();
    }
}
