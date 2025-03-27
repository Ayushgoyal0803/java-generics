package FlightSystem;

class Flight<T> {
    private T flightNumber;
    private String source;
    private String destination;

    Flight(T flightNumber, String source, String destination){
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;

    }

    public T getFlightNumber(){
        return flightNumber;
    }

    public void displayFlightInfo(){
        System.out.println("Flight number: " + flightNumber + " | From: " + source + " | To: " + destination);
    }
}
