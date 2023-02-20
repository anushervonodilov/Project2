package com.Project2;

public class Car {

    public double carPrice;
    public String color;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    public double calculateSalePrice() {
        return carPrice;
    }

}

class Sedan extends Car {

    double length;

    Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.90;
        }
    }

}

class Truck extends Car {

    double weight;

    public Truck(double carPrice, String color, double weight) {
        super(carPrice, color);
        this.weight = weight;
    }

    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.90;
        } else {
            return carPrice * 0.80;
        }
    }

    public static void main(String[] args) {

        Sedan sedan = new Sedan(50000, "blue", 21);
        System.out.println(sedan.calculateSalePrice());

        Truck truck = new Truck(80000, "Black", 5000);
        System.out.println(truck.calculateSalePrice());

    }

}
