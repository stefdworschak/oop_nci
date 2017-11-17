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
public class Flex extends Flight {
    private String inFlightMeal;
    private Double baggageWeight;

    public Flex(String flightNumber, String departure, String destination, Date departureDate, Date returnDate, String inFlightMeal, Double baggageWeight) {
        super(flightNumber, departure, destination, departureDate, returnDate);
        this.inFlightMeal = inFlightMeal;
        this.baggageWeight = baggageWeight;
    }

    public Flex(String flightNumber, String departure, String destination, Date departureDate,String inFlightMeal, Double baggageWeight) {
        super(flightNumber, departure, destination, departureDate);
        this.inFlightMeal = inFlightMeal;
        this.baggageWeight = baggageWeight;
    }

    public Flex() {
        this("","","",new Date(),new Date(),"",0.0);
    }

    public String getInFlightMeal() {
        return inFlightMeal;
    }

    public void setInFlightMeal(String inFlightMeal) {
        this.inFlightMeal = inFlightMeal;
    }

    public Double getBaggageWeight() {
        return baggageWeight;
    }

    public void setBaggageWeight(Double baggageWeight) {
        this.baggageWeight = baggageWeight;
    }
    
}
