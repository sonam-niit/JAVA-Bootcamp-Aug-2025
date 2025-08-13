package com.upgrade.gcm.models;

public class Fruit extends GroceryItem{

    private boolean isSeasonal;
    public Fruit(String name, double pricePerKg, double quantityKg,boolean isSeasonal) {
        super(name, pricePerKg, quantityKg);
        this.isSeasonal=isSeasonal;
    }

    @Override
    public void displayDetails() {
        System.out.println("----------------------------------------------");
        System.out.println("Fruit: "+getName());
        System.out.println("Price: "+getPricePerKg());
        System.out.println("Quantity: "+getQuantityKg()+" Kg");
        System.out.println("Seasonal: "+ (isSeasonal?"Yes":"No"));
        System.out.println("Total: "+(getQuantityKg()*getPricePerKg()));
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }
}
