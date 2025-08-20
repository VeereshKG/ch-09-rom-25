package com.xworkz.AmusementParkapp.AmusementPark;

public class AmusementPark {


   private int parkId;
    private  String name;
    private String location;
    private double entryFee;
    private String openingTime;
    private String closingTime;

   public int  getParkId(){
        return parkId;
    }

    public void setParkId(int parkId) {
        this.parkId = parkId;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name){
       this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(String openingTime) {
        this.openingTime = openingTime;
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
    }
}






