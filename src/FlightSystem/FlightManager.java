package FlightSystem;
import java.util.*;

public class FlightManager<T extends Number> {
    private List<Flight<T>> flightList = new ArrayList<>();
    public void addFlight(Flight<T> flight){
        flightList.add(flight);
    }

    public void displayFlights(){
        for(Flight<T> f: flightList){
            f.displayFlightInfo();
        }
    }
}
