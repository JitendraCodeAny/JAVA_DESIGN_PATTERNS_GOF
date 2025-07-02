package com.jitendra.dp.usecase.templatemethod;

// Testing Template Method Pattern - categorized under GOF Behavioral Patterns
// Airline Reservation System Application class demonstrate template pattern use case.
// Uses Template and concrete classes
public class AirlineReservationSystem {
    public static void main(String[] args) {
        System.out.println("<<< Domestic Flight Ticket Booking Process >>>");
        FlightBooking domesticBooking = new DomesticFlightBooking();
        domesticBooking.bookFlight();

        System.out.println("\n<<< International Flight Ticket Booking Process >>>");
        FlightBooking internationalBooking = new InternationalFlightBooking();
        internationalBooking.bookFlight();
    }
}
