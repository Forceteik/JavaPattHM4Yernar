package com;

import com.Engineer;
import com.Tester;
import com.WorkshopManager;

public interface WorkshopTeamFactory {
    Engineer getEngineer();
    Tester getTester();
    WorkshopManager getWorkshopManager();

}
