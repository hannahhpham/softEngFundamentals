package com.confirm_arrival;
//import all classes
import com.confirm_arrival.classes.Bus;
import com.confirm_arrival.classes.BusDriver;
import com.confirm_arrival.classes.Route;
import com.confirm_arrival.classes.Trip;
import com.confirm_arrival.classes.TripEvent;

// this contains the java skeleton code that interprets seuquence diagram 3 (confirm bus arrival times)
// this document was made by Hannah

public class Main {
    public static void main(String[] args) {
        //DUMMY DATA declare bus information (this exists outside the program, before entering the function)
        int driverID = 0;
        int routeID = 11;
        int tripID = 16052026;
        int busID = 17052026;
        int stopID = 5;

        //DUMMY DATA declare objects (these exist outside the program, before entering the sequence diagram)
        BusDriver currBusDriver = new BusDriver(driverID);
        Route currRoute = new Route(routeID);
        Trip currTrip = new Trip(tripID, currRoute.getId(), currBusDriver.getId());
        Bus currBus = new Bus(busID, currTrip.getId());

        if (currBus.approachingStop()) {
            currBusDriver.clickArrivalButton(); 

            //validating stop arrival occurs here
            if (currBus.confirmBusAtStop(stopID)) {
                currBus.locationSuccess();
                
                if (currRoute.confirmStopIsOnRoute(stopID)) {
                    currRoute.stopOnRouteSuccess();

                    //create a new tripEvent after successful validation
                    TripEvent approachedStop = new TripEvent(stopID, currTrip.getId(), 
                                                             currBus.getId(), currRoute.getId(), 
                                                             currBusDriver.getId());

                    approachedStop.sendEventLog();
                }
                else {
                    currTrip.stopOnRouteFailure();
                }
            }
            else {
                currTrip.busLocationError();
            }
        }
    }
}