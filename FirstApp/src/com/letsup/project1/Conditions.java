package com.letsup.project1;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1= scanner.nextInt();
        System.out.println("Second Number");
        int num2= scanner.nextInt();
        System.out.println("Enter\n+ for Addition\n- for Subtraction" +
                "\n* for Multiplication\n/ for Division");
        String input = scanner.next();
        if(input.equals("+")){
            System.out.println("Addition: "+(num1+num2));
        }else if(input.equals("-")){
            System.out.println("Subtraction: "+(num1-num2));
        }else if(input.equals("*")){
            System.out.println("Multiplication: "+(num1*num2));
        }else if(input.equals("/")){
            System.out.println("Division: "+(num1/num2));
        }else{
            System.out.println("Enter Correct Option");
        }
    }
}
