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
public class Business extends Flight {
    private String priorityBoarding, seatSelection;

    public Business(String flightNumber, String departure, String destination, Date departureDate, Date returnDate,String priorityBoarding, String seatSelection) {
        super(flightNumber, departure, destination, departureDate, returnDate);
        this.priorityBoarding = priorityBoarding;
        this.seatSelection = seatSelection;
    }

    public Business(String flightNumber, String departure, String destination, Date departureDate,String priorityBoarding, String seatSelection) {
        super(flightNumber, departure, destination, departureDate);
        this.priorityBoarding = priorityBoarding;
        this.seatSelection = seatSelection;
    }

    public Business(){
        this("","","",new Date(),new Date(),"","");
    }

    public String getPriorityBoarding() {
        return priorityBoarding;
    }

    public void setPriorityBoarding(String priorityBoarding) {
        this.priorityBoarding = priorityBoarding;
    }

    public String getSeatSelection() {
        return seatSelection;
    }

    public void setSeatSelection(String SeatSelection) {
        this.seatSelection = SeatSelection;
    }
    
    
    
}
