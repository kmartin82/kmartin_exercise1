package com.KevinMartin.week03;


import java.util.Scanner;

public class Main {
    static double fToC (double fahrenheit){
        double celsius = 5.0/9*(fahrenheit-32);
        return celsius;
    }

    static void display(double temperature){
        System.out.println("the temperature is " + temperature );

    }

    static double userInput() {
        System.out.println("Enter a Fahrenheit  temperature ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double doubleInput = Double.parseDouble(input);
        return doubleInput;
    }
    public static void main(String[] args) {
        Double userTemperature = userInput();
        while (userTemperature >=  -460){
            double celsius = fToC(userTemperature);
            display(celsius);
            userTemperature = userInput();
        }


    }
}