package assignment;

public class FlightManagement {

	public static void main(String[] args) {
		
		FlightDTO flight = new FlightDTO("AI202", "Air India", "New York", "Delhi","09:00 am", "10:00 am", 300, 650.00);
		
		System.out.println("Get flight details using getters :");
		System.out.println("Flight Number: " + flight.getFlightNumber());
        System.out.println("Airline: " + flight.getAirline());
        System.out.println("Origin: " + flight.getOrigin());
        System.out.println("Destination: " + flight.getDestination());
        System.out.println("Arrival Time: " + flight.getArrivalTime());
        System.out.println("Departure Time: " + flight.getDepartureTime());
        System.out.println("Capacity: " + flight.getCapacity());
        System.out.println("Price: " + flight.getTotalFlights());
		
		// update details
		flight.setFlightNumber("AI201");
		flight.setAirline("Indigo");
		flight.setOrigin("India");
		flight.setDestination("London");
		flight.setArrivalTime("11:00 pm");
		flight.setDepartureTime("11:30 pm");
		flight.setCapacity(200);
		flight.setPrice(1000);
		
		System.out.println();
		System.out.println("Displaying flight using displayFlightDetails method afrter modifying using setters :");
		flight.displayFlightDetails();
	}

}
