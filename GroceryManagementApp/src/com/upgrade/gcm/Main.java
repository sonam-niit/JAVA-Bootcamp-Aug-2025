package com.upgrade.gcm;

import com.upgrade.gcm.models.DairyProduct;
import com.upgrade.gcm.models.Fruit;
import com.upgrade.gcm.models.GroceryItem;
import com.upgrade.gcm.models.Vegetable;
import com.upgrade.gcm.services.InventoryService;
import com.upgrade.gcm.services.InventoryServiceImpl;
import com.upgrade.gcm.utils.DataLoad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //100% data abstraction
        InventoryService service=new InventoryServiceImpl();

        DataLoad load= new DataLoad();
        //add grocery Items

        while (true){
            System.out.println("Add Items in your Inventory");
            GroceryItem item =load.getData();
            service.addItem(item);
            System.out.println("Continue??");
            if(load.getScanner().next().equals("n"))
                break;
            else
                continue;
        }

        //Show Inventory
        service.showInventory();

        //Show total bill
        System.out.println("-----------final bill---------------");
        System.out.println("Total: "+service.calculateBill());
    }
}
