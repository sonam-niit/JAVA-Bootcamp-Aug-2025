package com.letsup.project1;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String username= scanner.next();
        System.out.println("Enter Your Age");
        int age= scanner.nextInt();

        System.out.println("Welcome to LetsUpgrade");
        System.out.println("****************************************");
        System.out.println("Your Name: "+username);
        System.out.println("Your Age: "+age);

        if(age>=18) {
            System.out.println("You are eligible for Vote");
        }else{
            System.out.println("You are not eligible for vote");
            System.out.println("Come for voting after "+ (18-age)+" Years");
        }
    }
}
