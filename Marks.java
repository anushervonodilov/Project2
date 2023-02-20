package com.Project2;

public abstract class Marks {

    abstract double getPercentage();

}

class A extends Marks {

    double math;
    double history;
    double chemistry;

    A(double math, double history, double chemistry) {
        this.math = math;
        this.history = history;
        this.chemistry = chemistry;
    }

    @Override
    double getPercentage() {
        double percentage = (math + history + chemistry) / 3;
        return percentage;
    }
}

class B extends Marks {

    double math;
    double history;
    double chemistry;
    double geography;

    B(double math, double history, double chemistry, double geography) {
        this.math = math;
        this.history = history;
        this.chemistry = chemistry;
        this.geography = geography;
    }

    @Override
    double getPercentage() {
        double percentage = (math + history + chemistry + geography) / 4;
        return percentage;
    }

    public static void main(String[] args) {

        A a = new A(80.7, 77, 90.5);
        System.out.println(a.getPercentage());

        B b = new B(98, 74.2, 97.8, 100);
        System.out.println(b.getPercentage());

    }

}
