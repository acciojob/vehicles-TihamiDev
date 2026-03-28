package com.driver;

public class Vehicle {

    String name;
    private int currentSpeed;
    private int currentDirection;
    public int getCurrentSpeed() {
        return currentSpeed;
    }
    public String getName() {
        return name;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public void move(int speed, int direction){
        this.currentSpeed = speed;
        this.currentDirection = direction;

        System.out.println("move method called - The speed is changed to: "
                + currentSpeed + ", and the direction is changed to: "
                + currentDirection + " degrees");
    }

    public void steer(int direction){
        this.currentDirection += direction;

        System.out.println("steer method called - The direction is changed to: "
                + currentDirection + " degrees");
    }

    public void stop(){
        this.currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
