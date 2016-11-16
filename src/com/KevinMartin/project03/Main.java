package com.KevinMartin.project03;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Item {
    private String titleString;
    private String descriptionString;
    private int priorityString;
    Scanner scanner = new Scanner(System.in);

    public Item(){

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

    public String promptDescription(String message){
        System.out.println(message);
        return scanner.nextLine();
    }

    public String promptTitle(String message ){
        System.out.println(message);
        return scanner.nextLine();
    }

    public int promptPriority(String message){
        System.out.println(message);
        String userInput = scanner.nextLine();

        int userInt = 0;
        boolean isInt = false;

        while (!isInt){
            try{
                userInt = Integer.parseInt(userInput);
                isInt = true;
            }
            catch(NumberFormatException e){
                System.out.println(message);
                userInput = scanner.nextLine();
            }
        }
        if (userInt > 5){
            return 5;
        }
        else if (userInt < 0 ){
            return 0;
        }
        else {
            return userInt;
        }
    }

}

public class Main {


    static void AddTask(List<Item> addTaskList) {
        String newTitleTaskString, newDescriptionTaskString;
        int newPriorityTaskInt;
        Item item = new Item();

        newTitleTaskString = item.promptTitle("Enter the new task's name.");
        newDescriptionTaskString = item.promptDescription("Enter the new task's description.");
        newPriorityTaskInt = item.promptPriority("Enter the new tasks priority");
        item.setTitleString(newTitleTaskString);
        item.setDescriptionString(newDescriptionTaskString);
        item.setPriorityString(newPriorityTaskInt);
        addTaskList.add(0, item);
    }


    static void RemoveTask(List<Item> removeTaskList) {
        int taskRemovedInt;
        System.out.println("Enter the index of the task to remove.");
        Scanner scanner = new Scanner(System.in);
        taskRemovedInt = Integer.parseInt(scanner.nextLine());
        removeTaskList.remove(taskRemovedInt);
    }


    static void UpdateTask(List<Item> updateTaskList) {
        String newTitleTaskString, newDescriptionTaskString;
        int newPriorityTaskInt;
        Item item = new Item();
        int updateTaskInt;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index of the task to update.");
        updateTaskInt = Integer.parseInt(scanner.nextLine());
        newTitleTaskString = item.promptTitle("Enter the new task's name.");
        newDescriptionTaskString = item.promptDescription("Enter the new task's description.");
        newPriorityTaskInt = item.promptPriority("Enter the new tasks priority");
        item.setTitleString(newTitleTaskString);
        item.setDescriptionString(newDescriptionTaskString);
        item.setPriorityString(newPriorityTaskInt);
        updateTaskList.set(updateTaskInt, item);

    }

    static void ListTask(List<Item> listTaskList) {
        int count = 0;
        for (Item item : listTaskList) {
            System.out.println("Task index: " + count + ", Name: " + item.getTitleString() +
                    ", Description: " + item.getDescriptionString() + ", Priority: " + item.getPriorityString());
            count++;
        }
    }

    static void ListPriorityTask(List<Item> listPriorityTask) {
        int priorityWantedInt = 0, count = 0;
        String priorityWantedString;
        boolean isInt = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a priority");
        priorityWantedString = scanner.nextLine();

        while (!isInt) {
            try {
                priorityWantedInt = Integer.parseInt(priorityWantedString);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.println("Enter a priority");
                priorityWantedString = scanner.nextLine();
            }
        }
        for (Item item : listPriorityTask) {
            if (item.getPriorityString() == priorityWantedInt) {
                System.out.println("Task index: " + count + ", Name: " + item.getTitleString() +
                        ", Description: " + item.getDescriptionString() + ", Priority: " + item.getPriorityString());
            }
            count++;
        }


    }

    public static void main(String[] args) {

        List<Item> tasks = new ArrayList<Item>();
        int actionWantedInt = 0;
        String actionWantedString;
        boolean exitLoop = false;
        Scanner scanner = new Scanner(System.in);

        while (!exitLoop) {
            boolean isInt = false;
            System.out.println("Menu");
            System.out.println("<1> Add a task.");
            System.out.println("<2> Remove a task.");
            System.out.println("<3> update a task.");
            System.out.println("<4> list all tasks.");
            System.out.println("<5> list all tasks of a certain priorityString.");
            System.out.println("<0> Exit ");
            actionWantedString = scanner.nextLine();
            while (!isInt) {
                try {
                    actionWantedInt = Integer.parseInt(actionWantedString);
                } catch (NumberFormatException e) {
                    System.out.println("Choose an option");
                    actionWantedString = scanner.nextLine();
                }
                if (actionWantedInt > 5 | actionWantedInt < 0) {
                    System.out.println("Choose an option");
                    actionWantedString = scanner.nextLine();
                } else {
                    isInt = true;
                }

            }

            if (actionWantedInt == 1) {
                AddTask(tasks);
            } else if (actionWantedInt == 2) {
                RemoveTask(tasks);
            } else if (actionWantedInt == 3) {
                UpdateTask(tasks);
            } else if (actionWantedInt == 4) {
                ListTask(tasks);
            } else if (actionWantedInt == 5) {
                ListPriorityTask(tasks);
            } else {
                exitLoop = true;
            }
        }
    }
}


