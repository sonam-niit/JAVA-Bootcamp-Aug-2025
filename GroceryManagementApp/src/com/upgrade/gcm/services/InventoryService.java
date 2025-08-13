package com.upgrade.gcm.services;

import com.upgrade.gcm.models.GroceryItem;

public interface InventoryService {
    public void addItem(GroceryItem item);
    public void showInventory();
    public double calculateBill();
    //public void removeItem();
    //public void updateQuantity(int quantity);

}
