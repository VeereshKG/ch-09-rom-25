package com.xworkz.casinoapp.casino;

public class Casino {

  private   int casinoId;
    private String name;
    private String location;
    private boolean isOpen24Hours;
    private double entryFee;

    public int getCasinoId() {
        return casinoId;
    }

    public void setCasinoId(int casinoId) {
        this.casinoId = casinoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
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
    public boolean getIsOpen24Hours(){
        return isOpen24Hours;
    }

    public void setIsOpen24Hours(boolean open24Hours) {
        isOpen24Hours = open24Hours;
    }
}
