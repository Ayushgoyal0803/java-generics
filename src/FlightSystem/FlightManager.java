package FlightSystem;
import java.util.*;

public class FlightManager {
    private List<Flight<?>> flightList = new ArrayList<>();
    public void addFlight(Flight<?> flight){
        flightList.add(flight);
    }

    public void displayFlights(){
        for(Flight<?> f: flightList){
            f.displayFlightInfo();
        }
    }
}
