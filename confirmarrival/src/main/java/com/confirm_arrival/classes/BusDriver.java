package com.confirm_arrival.classes;

public class BusDriver {
    private int[] authorisedRoutes;
    private String[] schedule;
    private int driverID;

    public BusDriver(int driverID) {
        this.driverID = driverID;
    }

    public int getId() {
        return this.driverID;
    }

    public void clickArrivalButton() {
        //actions occur here when button is clicked
    }

    public int[] getAuthorisedRoutes() {
        return this.authorisedRoutes;
    }

    public void confirmStopArrival(int stop) {
        //confirm that the bus curr being driven has arrived to the stop
    }

    public void reportHazard(String hazardInfo, String hazardType) {
        //create a report and send it to the operations centre
    }

    public void getNavGuidance(int serviceID) {
        //get navigation for this specific trip
    }

}