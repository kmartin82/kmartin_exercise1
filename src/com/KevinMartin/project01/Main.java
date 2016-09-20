package com.KevinMartin.project01;


import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    static void addTask(String addTaskArray[], int addTaskNumberInt){
        String newTask;
        System.out.println("Enter the description of the new task");
        Scanner scanner = new Scanner(System.in);
        newTask = scanner.nextLine();
        addTaskArray[addTaskNumberInt] = newTask;
    }


    static void removeTask(List removeTaskArray, int removeTaskNumberint){
        int taskRemovedInt;
        System.out.println("Enter the index of the task to remove.");
        Scanner scanner = new Scanner(System.in);
        taskRemovedInt = Integer.parseInt(scanner.nextLine());
        
        }

    }

    static void updateTask(){


    }

    static void listTask(){


    }

    public static void main(String[] args) {
        String  taskArray[] = {""};
        int actionWantedInt = 0 ,numberOfTaskInt = 0;
        boolean exitLoop = false;

        while (!exitLoop) {
            System.out.println("please choose an option:");
            System.out.println("<1> Add a task.");
            System.out.println("<2> Remove a task.");
            System.out.println("<3> update a task.");
            System.out.println("<4> list all tasks.");
            System.out.println("<0> exit ");

            Scanner scanner = new Scanner(System.in);
            actionWantedInt = Integer.parseInt(scanner.nextLine());

            if (actionWantedInt == 1) {
                addTask(taskArray, numberOfTaskInt);
                numberOfTaskInt++;
            } else if (actionWantedInt == 2) {
                removeTask(taskArray, numberOfTaskInt);
                numberOfTaskInt--;
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
