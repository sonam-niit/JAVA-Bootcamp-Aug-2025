package com.upgrade.gcm.models;

public class Vegetable extends GroceryItem{

    private boolean isOrganic;

    public Vegetable(String name, double pricePerKg, double quantityKg, boolean isOrganic) {
        super(name, pricePerKg, quantityKg);
        this.isOrganic = isOrganic;
    }

    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    @Override
    public void displayDetails() {
        System.out.println("----------------------------------------------");
        System.out.println("Vegetable: "+getName());
        System.out.println("Price: "+getPricePerKg());
        System.out.println("Quantity: "+getQuantityKg()+" Kg");
        System.out.println("Organic: "+ (isOrganic?"Yes":"No"));
        System.out.println("Total: "+(getQuantityKg()*getPricePerKg()));
    }
}
