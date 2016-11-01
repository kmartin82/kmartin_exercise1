package com.KevinMartin.exam02;
class Building {
    String address;

    Building(String address) {
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Address:" + address);
    }
}
class House extends Building{
    int residents;

    House(String address, int residents){
        super(address);
        this.residents = residents;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Residents: " + residents);
    }
}


public class Main {
    public static void main(String[] args) {
        Building building = new Building("123 Main St.");
        House house = new House("456 High St.", 4);
        building.displayInfo();
        house.displayInfo();
    }
}

