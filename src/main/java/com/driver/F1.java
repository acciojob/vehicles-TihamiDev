package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super(name, 4, 2, 6, isManual, "F1", 2);
    }

    public void accelerate(int rate){
        int newSpeed = getCurrentSpeed() + rate;

        if(newSpeed <= 0){
            stop();
            changeGear(1);
            return;
        }

        int newGear;

        if(newSpeed > 0 && newSpeed <= 50) {
            newGear = 1;
        } else if(newSpeed <= 100) {
            newGear = 2;
        } else if(newSpeed <= 150) {
            newGear = 3;
        } else if(newSpeed <= 200) {
            newGear = 4;
        } else if(newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6;
        }

        changeGear(newGear);
        changeSpeed(newSpeed, getCurrentDirection());
    }
}
