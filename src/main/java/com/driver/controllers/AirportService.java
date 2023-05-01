package com.driver.controllers;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;

public class AirportService {
    AirportRepository airportRepository= new AirportRepository();

    public void addAirport(Airport airport) {
        airportRepository.addAirport(airport);
    }

    public String getLargestAirportName() {
        return airportRepository.getLargestAirportName();
    }

    public void aaddFlight(Flight flight) {
        airportRepository.addFlight(flight);
    }

    public void addPassenger(Passenger passenger) {
        airportRepository.addPassenger(passenger);
    }

    public String bookATicket(Integer flightId, Integer passengerId) {
       return  airportRepository.bookATicket(flightId,passengerId);
    }

    public String cancelATicket(Integer flightId, Integer passengerId) {
       return airportRepository.cancelATicket(flightId,passengerId);
    }

    public int countOfBookingsDoneByPassengerAllCombined(Integer passengerId) {
        return airportRepository.countOfBookingsDoneByPassengerAllCombined(passengerId);
    }

    public int calculateFare(Integer flightId) {
        return airportRepository.calculateFare(flightId);
    }

    public double getShortestTime(City fromCity, City toCity) {
        return airportRepository.getShortestTime(fromCity,toCity);
    }

    public int calculateRevenueOfAFlight(Integer flightId) {
        return airportRepository.calculateRevenueOfAFlight(flightId);
    }

    public String getAirportName(Integer flightId) {
       return airportRepository.getAirportNmae(flightId);
    }
}
