package com.xworkz.crackersapp.crackers;

public class Crackers {


   private int crackerId;
    private String name;
   private String brand;
    private double price;
    private boolean isLoud;


    public int getCrackerId() {
        return crackerId;
    }

    public void setCrackerId(int crackerId) {
        this.crackerId = crackerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public boolean getIsLoud(){
        return isLoud;
    }

    public void setIsLoud(boolean loud) {
        isLoud = loud;
    }
}

