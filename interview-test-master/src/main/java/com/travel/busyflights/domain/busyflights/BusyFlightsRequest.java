package com.travel.busyflights.domain.busyflights;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Entity;

//@Entity
public class BusyFlightsRequest {
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idBusyFly;
	
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOfPassengers;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin( String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination( String destination) {
        this.destination = destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate( String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate( String returnDate) {
        this.returnDate = returnDate;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers( int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }
}
