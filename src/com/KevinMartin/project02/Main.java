package com.KevinMartin.project02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class Item {
    private String titleString;
    private String descriptionString;
    private int priorityString;

     public Item(String title, String description, int priority){
         this.titleString = title;
         this.descriptionString = description;
         this.priorityString = priority;
     }

     public String getDescriptionString() {
         return descriptionString;
     }

     public void setDescriptionString(String descriptionString) {
         this.descriptionString = descriptionString;
     }

     public String getTitleString() {
         return titleString;
     }

     public void setTitleString(String titleString) {
         this.titleString = titleString;
     }

     public int getPriorityString() {
         return priorityString;
     }

     public void setPriorityString(int priorityString) {
         this.priorityString = priorityString;
     }
 }

public class Main {


    static void addTask(List addTaskList){
        String newTitleTaskString, newDescriptionTaskString;
        int newPriorityTaskInt;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new tasks descriptionString");
        newTitleTaskString = scanner.nextLine();
        System.out.println("Enter the new tasks descriptionString");
        newDescriptionTaskString = scanner.nextLine();
        System.out.println("Enter the new tasks descriptionString");
        newPriorityTaskInt = Integer.parseInt(scanner.nextLine());
        addTaskList.add(1, new Item(newTitleTaskString, newDescriptionTaskString, newPriorityTaskInt ));
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
        System.out.println("Enter the index of the task to update.");
        Scanner scanner = new Scanner(System.in);
        updateTaskInt = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the new descriptionString of the task.");
        newTaskString = scanner.nextLine();
        updateTaskList.set(updateTaskInt, newTaskString);

    }

    static void listTask(List listTaskList){
        for (int count = 0 ; count < listTaskList.size()   ; count++){
            System.out.println(count +". "+ listTaskList.get(count));
        }
    }

    public static void main(String[] args) {

        List<Item> tasks = new ArrayList<Item>();
        int actionWantedInt;
        boolean exitLoop = false;
        Scanner scanner = new Scanner(System.in);

        while (!exitLoop) {
            System.out.println("please choose an option:");
            System.out.println("<1> Add a task.");
            System.out.println("<2> Remove a task.");
            System.out.println("<3> update a task.");
            System.out.println("<4> list all tasks.");
            System.out.println("<5> list all tasks of a certain priorityString.");
            System.out.println("<0> Exit ");

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
            else if (actionWantedInt == 5){

            }
            else {
                exitLoop = true;
            }
        }
    }



}