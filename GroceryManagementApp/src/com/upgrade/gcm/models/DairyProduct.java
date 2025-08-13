package com.upgrade.gcm.models;

public class DairyProduct extends GroceryItem{
    private double fatContent;

    public DairyProduct(String name, double pricePerKg, double quantityKg, double fatContent) {
        super(name, pricePerKg, quantityKg);
        this.fatContent = fatContent;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    @Override
    public void displayDetails() {
        System.out.println("----------------------------------------------");
        System.out.println("Dairy: "+getName());
        System.out.println("Price: "+getPricePerKg());
        System.out.println("Quantity: "+getQuantityKg()+" Kg");
        System.out.println("Fat Content: "+ fatContent+"%");
        System.out.println("Total: "+(getQuantityKg()*getPricePerKg()));
    }
}
