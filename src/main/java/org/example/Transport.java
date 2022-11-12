package org.example;

public class Transport {
    private double power;
    private double speed;
    private String model;
    private int weight;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        System.out.println(model.toString());
        return "Модель авто - " +


                model;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        System.out.printf("Допустимая скорость %.2f \n", speed);
        return speed;
    }


    public String toString() {
        return model;
    }
}