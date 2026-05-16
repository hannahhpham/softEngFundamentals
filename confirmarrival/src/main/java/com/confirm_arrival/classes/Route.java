package com.confirm_arrival.classes;

public class Route {
    private int routeNumber;
    private int[] allRouteStops;
    private String[] routeInfo;

    public Route(int routeID) {
        this.routeNumber = routeID;

    }

    public int getId() {
        return this.routeNumber;
    }

    public boolean confirmStopIsOnRoute(int stopID) {
        for (int i = 0 ; i < allRouteStops.length ; i++) {
            if (allRouteStops[i] == stopID) {
                return true;
            }
        }
        return false;
    }

    public void stopOnRouteSuccess() {
        System.out.println("The inputted stop is confirmed to be on this route");
    }

    public int[] getStopOrder() {
        return this.allRouteStops;
    }

    public int[] getActiveStops() {
        //filter the 'allRouteStops' by which stops are currently serviced.
        return this.allRouteStops;
    }

    public void updateRouteInfo(String[] routeInfo) {
        //update details: name, areas it goes thru, times, etc
    }

}
