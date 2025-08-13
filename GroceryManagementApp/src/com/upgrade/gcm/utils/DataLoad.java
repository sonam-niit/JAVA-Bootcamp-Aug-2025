package com.upgrade.gcm.utils;

import com.upgrade.gcm.models.DairyProduct;
import com.upgrade.gcm.models.Fruit;
import com.upgrade.gcm.models.GroceryItem;
import com.upgrade.gcm.models.Vegetable;

import java.util.ArrayList;
import java.util.Scanner;

public class DataLoad {
    Scanner scanner;
    public DataLoad(){
         scanner= new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public GroceryItem getData(){
        GroceryItem item=null;
        System.out.println("Enter which product you want to purchase");
        System.out.println("choose 1 fro fruit,2 for Vegetable,3 for Dairy Product");
        int type= scanner.nextInt();
        System.out.println("Enter Product Name");
        String name = scanner.next();
        System.out.println("Enter Product Price");
        double price= scanner.nextDouble();
        System.out.println("Enter Product quantity");
        double quantity= scanner.nextDouble();
        switch (type){
            case 1:
                System.out.println("Seasonal Fruit??type y for Yes");
                boolean isSeasonal= scanner.next().equals("y")?true:false;
                item = new Fruit(name,price,quantity,isSeasonal);
                break;
            case 2:
                System.out.println("Organic Fruit??type y for Yes");
                boolean isOrganic= scanner.next().equals("y")?true:false;
                item = new Vegetable(name,price,quantity,isOrganic);
                break;
            case 3:
                System.out.println("Enter Fat Content");
                double fatContent= scanner.nextDouble();
                item = new DairyProduct(name,price,quantity,fatContent);
                break;
        }
        return item;
    }

}
