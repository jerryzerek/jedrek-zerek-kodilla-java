package com.kodilla.good.patterns.challenges.FlightsExample;

public class Main {
    public static void main(String[] args) {

        FlightSearch fs = new FlightSearch(new FlightsRepo().retrieveFlightSet());

        System.out.println("Możliwe loty z " + Airport.WAW.getName() + " to: " + fs.findDestinationsFrom(Airport.WAW));

        System.out.println("Do " + Airport.KRK.getName() + " możesz lecieć z " + fs.findDepartureAirports(Airport.KRK));

    }
}
