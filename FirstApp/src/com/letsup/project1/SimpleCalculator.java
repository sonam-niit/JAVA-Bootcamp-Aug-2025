package com.letsup.project1;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.println("Enter First Number");
            int num1= scanner.nextInt();
            System.out.println("Second Number");
            int num2= scanner.nextInt();
            System.out.println("Enter\n+ for Addition\n- for Subtraction" +
                    "\n* for Multiplication\n/ for Division");
            String input = scanner.next();
            switch (input) {
                case "+": System.out.println("Addition: "+(num1+num2));
                    break;
                case "-": System.out.println("Subtraction: "+(num1-num2));
                    break;
                case "*": System.out.println("Multiplication: "+(num1*num2));
                    break;
                case "/":
                    if(num2==0)
                        System.out.println("cannot divide by Zero");
                    else
                        System.out.println("Division: "+(num1/num2));
                    break;
                default:
                    System.out.println("incorrect option selected");
            }
            System.out.println("Enter Y to Continue and N to exit");
            String op = scanner.next();
            if(op.equals("N") || op.equals("n"))
                break;
        }

    }
}
