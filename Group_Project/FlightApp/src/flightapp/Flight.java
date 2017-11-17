package flightapp;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x16102860
 */
public class Flight {
    protected String flightNumber,departure, destination;
    protected Date departureDate, returnDate;

    public Flight(String flightNumber, String departure, String destination, Date departureDate, Date returnDate) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
    }
    public Flight(String flightNumber, String departure, String destination, Date departureDate) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.departureDate = departureDate;
    }
    public Flight() {
        this("","","",new Date(),new Date());
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String Destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date DepartureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date ReturnDate) {
        this.returnDate = returnDate;
    }
    
            
    
}
