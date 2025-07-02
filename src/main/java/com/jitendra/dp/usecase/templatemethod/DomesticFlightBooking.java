package com.jitendra.dp.usecase.templatemethod;

//Concreate class for domestic flight booking
public class DomesticFlightBooking extends FlightBooking {

    @Override
    protected void searchFlight() {
        System.out.println("Searching for domestic flights");
    }

    @Override
    protected void selectSeat() {
        System.out.println("Selecting seat for domestic flight");
    }

    @Override
    protected void makePayment() {
        System.out.println("Processing payment for domestic flight");
    }
}
