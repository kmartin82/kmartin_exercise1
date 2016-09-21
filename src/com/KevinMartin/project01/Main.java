package com.KevinMartin.project01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    static void addTask(List addTaskList){
        String newTaskString;
        System.out.println("Enter the description of the new task");
        Scanner scanner = new Scanner(System.in);
        newTaskString = scanner.nextLine();
        addTaskList.add(0, newTaskString);
    }


    static void removeTask(List removeTaskList){
        int taskRemovedInt;
        System.out.println("Enter the index of the task to remove.");
        Scanner scanner = new Scanner(System.in);
        taskRemovedInt = Integer.parseInt(scanner.nextLine());
        removeTaskList.remove(taskRemovedInt);
        }



    static void updateTask(List updateTaskList){
        int updateTaskInt;
        String newTaskString;
        System.out.println("Enter the index of the task to remove.");
        Scanner scanner = new Scanner(System.in);
        updateTaskInt = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the new description of the task.");
        newTaskString = scanner.nextLine();
        updateTaskList.set(updateTaskInt, newTaskString);

    }

    static void listTask(List listTaskList){
        for (int count = 0 ; count < listTaskList.size()   ; count++){
            System.out.println(count +". "+ listTaskList.get(count));
        }
    }

    public static void main(String[] args) {

        List<String> tasks = new ArrayList<>();
        int actionWantedInt;
        boolean exitLoop = false;
        Scanner scanner = new Scanner(System.in);

        while (!exitLoop) {
            System.out.println("please choose an option:");
            System.out.println("<1> Add a task.");
            System.out.println("<2> Remove a task.");
            System.out.println("<3> update a task.");
            System.out.println("<4> list all tasks.");
            System.out.println("<0> exit ");

            actionWantedInt = Integer.parseInt(scanner.nextLine());

            if (actionWantedInt == 1) {
                addTask(tasks);
            }
            else if (actionWantedInt == 2) {
                removeTask(tasks);
            }
            else if (actionWantedInt == 3) {
                updateTask(tasks);
            }
            else if (actionWantedInt == 4) {
                listTask(tasks);
            }
            else {
                exitLoop = true;
            }
            actionWantedInt = 0;
        }
    }



}
