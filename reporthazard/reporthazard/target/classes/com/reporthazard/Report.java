
import java.time.LocalDateTime;
import com.HazardType;
public class Report {
    private String reportId;
    private HazardType hazardType;
    private LocalDateTime now;
    private int driverID;
    private String location;
    private String message;

    public Report(String reportId, LocalDateTime now, int driverID, String location, String message, HazardType hazardType) {
        this.reportId = reportId;
        this.now = now;
        this.driverID = driverID;
        this.location = location;
        this.message = message;
        this.hazardType = hazardType;
    }

    public String getReportId(){
        return this.reportId;
    }

    public LocalDateTime getTime(){
        return this.now;
    }

    public int getDriverId(){
        return this.driverID;
    }

    public String getLocation(){
        return this.location;
    }

    public String getMessage(){
        return this.message;
    }

    public void setHazard(HazardType hazardType){
        this.hazardType = hazardType;
    }


}