package com.KevinMartin.week02;


public class Main {

    public static void main(String[] args){
        String[] days ={"Wednesday", "Thursday","Friday","Saturday", "Sunday", "Monday", "Tuesday"};
        int[] temps = {45,29,10,22,41,28,33};
        int[] precip = {95,60,25,50,75,90};

        int tempThershold = 32;
        int precipThershold = 50;

        for (int i=0; i<days.length; i++){
            if((temps[i]<=tempThershold) && (precip[i] > precipThershold)){
                System.out.println(days[i]);
            }


        }

    }

}
