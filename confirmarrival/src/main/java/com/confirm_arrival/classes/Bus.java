package com.confirm_arrival.classes;

public class Bus {
    private int busID;
    private String model;
    private int capacity;
    private boolean isActive;
    private int tripID;

    public Bus(int busID, int tripID) {
        this.busID = busID;
        this.tripID = tripID;
    }

    public int getId() {
        return this.busID;
    }

    public boolean approachingStop() {
        //validation occurs to check if the bus is actually at the stop
        return true;
    }

    public boolean confirmBusAtStop(int stopID) {
        if (getLocation() == stopID) {
            return true;
        }
        else {
            return false;
        }
    }

    public void locationSuccess() {
        System.out.println("The bus is confirmed to be at " + getLocation());
    }

    public int getLocation() {
        //get location of this bus
        return 0;
    }

    public void assignService(int serviceID) {
        //assign this bus to a specific scheduled service
    }

    public boolean isActive() {
        //check if this bus is curently in service doing a trip
        return true;
    }

}
