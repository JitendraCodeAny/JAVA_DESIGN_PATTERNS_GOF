package com.jitendra.dp.usecase.templatemethod;

//Concreate class for international flight booking
public class InternationalFlightBooking extends FlightBooking {

    @Override
    protected void searchFlight() {
        System.out.println("Searching for international flights");
    }

    @Override
    protected void selectSeat() {
        System.out.println("Selecting seat for international flight");
    }

    @Override
    protected void makePayment() {
        System.out.println("Processing payment for international flight");
    }
}
