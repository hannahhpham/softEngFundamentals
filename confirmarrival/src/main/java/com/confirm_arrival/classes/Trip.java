package com.confirm_arrival.classes;

public class Trip {
    private int serviceID;
    private String status; //'late', 'early', 'on-time'
    private String currStop;
    private TripEvent[] events;
    private int routeID;
    private int driverID;

    public Trip(int tripID, int routeID, int driverID) {
        this.serviceID = tripID;
        this.routeID = routeID;
        this.driverID = driverID;

    }

    public int getId() {
        return this.serviceID;
    }

    public String[] getActualStopTimes() {
        //see what times the bus actually arrives at the stops
        String[] actualStops = {};
        return actualStops;
    }

    public void stopOnRouteFailure() {
        System.out.println("This stop is not on the route.");
    }

    public void busLocationError() {
        System.out.println("The bus is not at the specified location.");
    }
    
    public void startTrip() {
        //alert ops centre that this bus is starting
    }

    public void endTrip() {
        //alert ops centre that bus is done
    }
}