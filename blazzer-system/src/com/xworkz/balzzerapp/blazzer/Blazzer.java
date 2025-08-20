package com.xworkz.balzzerapp.blazzer;

public class Blazzer {

  private   int blazzerId;
   private String color;
    private int size;
    private String brand;
    private double price;
    private String fabric;

    public int getBlazzerId() {
        return blazzerId;
    }
    public void setBlazzerId(int blazzerId) {
        this.blazzerId = blazzerId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
}
