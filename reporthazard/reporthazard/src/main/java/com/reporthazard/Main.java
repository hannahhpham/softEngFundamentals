package com.reporthazard;

package com;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;
import javax.print.attribute.standard.DateTimeAtCreation;

public class Main{
    public static void main(String[] args) {
        Scanner inputMessage = new Scanner(System.in);
        //dummy data
        int driverID = 0;
        BusDriver BusDriver = new BusDriver(driverID);             

        //this is in the place of a name of an approximate location of the bus
        String location = "Building 16 336/348 Swanston St, Melbourne VIC 3000";

        if (BusDriver.reportEmergency()){
            LocalDateTime now = LocalDateTime.now(); 
            String reportId = UUID.randomUUID().toString(); 
            String message = "";
            HazardType hazard;
            
            if (BusDriver.chooseHazard()){
            hazard = hazard.ACCIDENT;
                BusDriver.setHazard(hazard);
            }

            

            if (BusDriver.attachMessage()){
                System.out.println("Enter your message: ");
                message = System.console().readLine();
            }
            
            if (BusDriver.submitReport()){
                //submits report
                Report currReport = new Report(reportId, now, driverID, location, message, hazard);
                
                //actions to send report to db then to bus dispatcher
            }
        }
    }
}