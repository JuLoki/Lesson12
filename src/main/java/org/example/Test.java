package org.example;
import Transport.Motorcycle;
import Transport.Car;

public class Test {
    public static void main(String[] args) {

        Transport chevrolet = new Transport();
        chevrolet.setModel("volt");
        chevrolet.getModel();

        Car car1 = new Car();
        car1.setModel("Tuning car");
        car1.getModel();
        car1.setSpeed(70.857);
        car1.getSpeed();

        Motorcycle kawasaki = new Motorcycle();
        kawasaki.setModel("Kawasaki");
        kawasaki.getModel();
        kawasaki.setSpeed(60.0948);
        kawasaki.getSpeed();


    }
}
