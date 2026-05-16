package com.confirm_arrival.classes;

public class TripEvent {
    private int eventID;
    private int timeStamp;
    private String eventType;
    private String[] eventDetails;
    private int stopID;
    private int tripID;
    private int busID;
    private int routeID;
    private int driverID;

    public TripEvent(int stopID, int tripID, int busID, int routeID, int driverID) {
        this.stopID = stopID;
        this.tripID = tripID;
        this.busID = busID;
        this.routeID = routeID;
        this.driverID = driverID;

    }

    public void sendEventLog() {
        System.out.println("Event details: stopID is " + this.stopID + ", driverID is " + this.driverID);
    }

    public void alertOperationsCentre() {
        //check event type. if its a big incident then alert
    }

    public String[] getEventDetails() {
        return this.eventDetails;
    }

}