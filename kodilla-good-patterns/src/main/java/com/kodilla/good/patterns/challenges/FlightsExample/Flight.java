package com.kodilla.good.patterns.challenges.FlightsExample;

import java.util.Objects;

public class Flight {
    private Airport airportFrom;
    private Airport airportTo;

    public Flight(Airport airportFrom, Airport airportTo) {
        this.airportTo = airportTo;
        this.airportFrom = airportFrom;
    }

    public Airport getAirportTo() {
        return airportTo;
    }

    public Airport getAirportFrom() {
        return airportFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return getAirportTo() == flight.getAirportTo() &&
                getAirportFrom() == flight.getAirportFrom();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirportTo(), getAirportFrom());
    }
}
