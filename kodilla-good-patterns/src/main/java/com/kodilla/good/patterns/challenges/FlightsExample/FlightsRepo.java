package com.kodilla.good.patterns.challenges.FlightsExample;

import java.util.HashSet;

public class FlightsRepo {
    public HashSet<Flight> retrieveFlightSet() {

        HashSet<Flight> flights = new HashSet<>();

        flights.add(new Flight(Airport.WAW, Airport.KRK));
        flights.add(new Flight(Airport.WAW, Airport.GDN));

        return flights;
    }
}
