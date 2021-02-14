/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.bean.ManagedBean;


import javax.faces.bean.SessionScoped;

/**
 *
 * @author JEE
 */
@ManagedBean(name="flightSearch")
@SessionScoped
public class FlightSearch implements Serializable{
  
    private String fromLocation;
    private String toLocation;
    private Date deparningDate;
    private Date returningDate;
    private String airlinesName;
    private int availableSeat;
    private int capacity;
    private double fare;
    ArrayList<Flight> flights = new ArrayList<Flight>();

    public FlightSearch() {
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Date getDeparningDate() {
        return deparningDate;
    }

    public void setDeparningDate(Date deparningDate) {
        this.deparningDate = deparningDate;
    }

    public Date getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(Date returningDate) {
        this.returningDate = returningDate;
    }

    public String getAirlinesName() {
        return airlinesName;
    }

    public void setAirlinesName(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }
    
   public String search(){
       
       return "searchResult.xhtml";
   } 
   
   public String addFlight(){
       
     return "index.xhtml";  
   }
}

