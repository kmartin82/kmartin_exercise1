package com.KevinMartin.project01;


import java.util.Scanner;

public class Main {


    static void addTask(){

        }


    static void removeTask(){


    }

    static void updateTask(){


    }

    static void listTask(){


    }

    public static void main(String[] args) {
        String taskArray[] = {};
        int actionWantedInt;
        boolean exitLoop = false;

        while (exitLoop != true ) {
            System.out.println("please choose an option:");
            System.out.println("<1> Add a task.");
            System.out.println("<2> Remove a task.");
            System.out.println("<3> update a task.");
            System.out.println("<4> list all tasks.");
            System.out.println("<0> exit ");

            Scanner scanner = new Scanner(System.in);
            actionWantedInt = Integer.parseInt(scanner.nextLine());

            if (actionWantedInt == 1) {

                System.out.println("add");
            } else if (actionWantedInt == 2) {
                removeTask();
                System.out.println("remove");
            } else if (actionWantedInt == 3) {
                updateTask();
                System.out.println("update");
            } else if (actionWantedInt == 4) {
                listTask();
                System.out.println("list");
            } else {
                exitLoop = true;
            }
            actionWantedInt = 0;
        }
    }



}
