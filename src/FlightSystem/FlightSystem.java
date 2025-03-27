package FlightSystem;
//import java.util.*;

public class FlightSystem {
    public static void main(String[] args) {
        Flight<Integer> flight1 = new Flight<>(101,"Chandigarh","Delhi");
        Flight<String> flight2 = new Flight<>("AA202", "Los Angeles", "Tokyo");

        Booking<Integer> booking1 = new Booking<Integer>(5005,flight1,"Ayush Goyal");
        Booking<String> booking2 = new Booking<String>("AB501",flight2,"Ashish Garg");

        booking1.displayBookingInfo();
        System.out.println("------------------------");
        booking2.displayBookingInfo();

        System.out.println("\n--- Flight Management ---");
        FlightManager allFlights = new FlightManager();
        allFlights.addFlight(flight1);
        allFlights.addFlight(flight2);

        allFlights.displayFlights();
        FlightUtility.displayFlightDetails(allFlights.getFlightList());

    }
}
