package com.upgrade.gcm.services;

import com.upgrade.gcm.models.GroceryItem;

import java.util.ArrayList;

public class InventoryServiceImpl implements InventoryService{
    private ArrayList<GroceryItem> inventory= new ArrayList<>();
    @Override
    public void addItem(GroceryItem item) {
        inventory.add(item);
        System.out.println(item.getName()+" added to inventory");
    }

    @Override
    public void showInventory() {
        if(inventory.isEmpty())
            System.out.println("Inventory is Empty");
        else{
            System.out.println("---------Grocery Inventory----------");
            for(GroceryItem item:inventory){
                item.displayDetails();//Polymorphism
            }
        }
    }

    @Override
    public double calculateBill() {
        double total=0;
        for(GroceryItem item:inventory){
            total+=(item.getPricePerKg()*item.getQuantityKg());
        }
        return total;
    }
}
