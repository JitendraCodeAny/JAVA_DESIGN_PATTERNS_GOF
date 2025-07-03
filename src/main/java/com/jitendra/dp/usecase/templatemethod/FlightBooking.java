package com.jitendra.dp.usecase.templatemethod;

//Abstract class with template method defined
public abstract class FlightBooking {
    // Template method -  declared final to prevent overriding by subclasses
    public final void bookFlight() {
        searchFlight();
        selectSeat();
        additionalChecks();
        makePayment();
        generateTicket();
    }

    protected abstract void searchFlight();
    protected abstract void selectSeat();
    protected abstract void makePayment();

    // hook method
    protected void additionalChecks() {
        // default: do nothing
    }

    // Common step implemented in base class
    protected void generateTicket() {
        System.out.println("Generating Ticket for flight booking");
    }
}
