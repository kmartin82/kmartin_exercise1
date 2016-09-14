package com.KevinMartin.week03;


import java.util.Scanner;

public class Main {
    static double fToC (double fahrenheit){
        double calcuis = 5.0/9*(fahrenheit-32);
        return calcuis;
    }

    static void display(double temperture){
        System.out.println("the tempature is " + temperture );

    }

    static double userInput(){
        System.out.println("Enter a Fahrenheit  temperature ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double doubleInput = Double.parseDouble(input);
        return doubleInput;
    }
    public static void main(String[] args) {
        Double userTempature = userInput();
        while (userTempature >=  -460){
            double celsuis = fToC(userTempature);
            display(celsuis);
            userTempature = userInput();
        }


    }
}