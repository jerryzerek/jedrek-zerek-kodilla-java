package com.kodilla.good.patterns.challenges.FlightsExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSearch {
    HashSet<Flight> flightDB;

    public FlightSearch(HashSet<Flight> flightDB) {
        this.flightDB = flightDB;
    }

    public ArrayList<String> findDestinationsFrom(Airport airport) {
        ArrayList<String> foundFlights;

        foundFlights = this.flightDB.stream()
                .filter(f -> f.getAirportFrom().equals(airport))
                .map(f -> f.getAirportTo().getName())
                .collect(Collectors.toCollection(ArrayList::new));

        return foundFlights;
    }

    public ArrayList<String> findDepartureAirports(Airport airport) {
        ArrayList<String> foundFlight;

        foundFlight = this.flightDB.stream()
                .filter(f -> f.getAirportTo().equals(airport))
                .map(f -> f.getAirportFrom().getName())
                .collect(Collectors.toCollection(ArrayList::new));

        return foundFlight;
    }


}
