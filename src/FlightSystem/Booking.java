package FlightSystem;

class Booking<T> {
    private T bookingId;
    private Flight<?> flight;
    private String passengerName;

    Booking(T bookingId, Flight<?> flight, String passengerName){
        this.bookingId = bookingId;
        this.flight = flight;
        this.passengerName = passengerName;
    }

    public void displayBookingInfo(){
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Passenger Name: " + passengerName);
        flight.displayFlightInfo();
    }
}
