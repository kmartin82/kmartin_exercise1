package com.KevinMartin.project03;
import java.util.*;
import java.util.function.Consumer;


class TaskCollection implements Iterable<Item>{
    private List<Item> tasks = new ArrayList<>();

    public void add(){
        String newTitleTaskString, newDescriptionTaskString;
        int newPriorityTaskInt;
        Item item = new Item();

        newTitleTaskString = item.promptTitle("Enter the new task's name.");
        newDescriptionTaskString = item.promptDescription("Enter the new task's description.");
        newPriorityTaskInt = item.promptPriority("Enter the new tasks priority");
        item.setTitleString(newTitleTaskString);
        item.setDescriptionString(newDescriptionTaskString);
        item.setPriorityString(newPriorityTaskInt);
        tasks.add(item);
    }
    public void remove(){
        int taskRemovedInt;
        System.out.println("Enter the index of the task to remove.");
        Scanner scanner = new Scanner(System.in);
        taskRemovedInt = Integer.parseInt(scanner.nextLine());
        tasks.remove(taskRemovedInt);
    }
    public void set(){
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
        tasks.set(updateTaskInt, item);
    }
    public void listTasks(){
        int count = 0;
        for (Item item : tasks) {
            System.out.println("Task index: " + count + ", Name: " + item.getTitleString() +
                    ", Description: " + item.getDescriptionString() + ", Priority: " + item.getPriorityString());
            count++;
        }
    }

    public void listPriorityTask() {
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
        for (Item item : tasks) {
            if (item.getPriorityString() == priorityWantedInt) {
                System.out.println("Task index: " + count + ", Name: " + item.getTitleString() +
                        ", Description: " + item.getDescriptionString() + ", Priority: " + item.getPriorityString());
            }
            count++;
        }
    }
    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Iterator<Item> iterator() {
        return tasks.iterator();
    }
}


class Item implements Comparable<Item> {
    private String titleString;
    private String descriptionString;
    private int priorityString;
    Scanner scanner = new Scanner(System.in);

    @Override
    public int compareTo(Item o) {
        if (!(priorityString == o.getPriorityString())){
            return priorityString - o.getPriorityString();
        }
        else {
            return titleString.compareTo(o.getTitleString());
        }
    }

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


    static void AddTask( TaskCollection taskCollection) {
        taskCollection.add();
    }


    static void RemoveTask(TaskCollection taskCollection) {
        taskCollection.remove();
    }


    static void UpdateTask(TaskCollection taskCollection) {
        taskCollection.set();
    }

    static void ListTask(TaskCollection taskCollection) {
       taskCollection.listTasks();
    }

    static void ListPriorityTask(TaskCollection taskCollection) {
        taskCollection.listPriorityTask();
    }

    public static void main(String[] args) {

        TaskCollection tasks = new TaskCollection();
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


