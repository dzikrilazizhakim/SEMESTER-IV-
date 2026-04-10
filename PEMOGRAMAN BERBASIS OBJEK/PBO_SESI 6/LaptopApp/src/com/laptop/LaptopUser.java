package com.laptop;

public class LaptopUser {

    private Laptop laptop;

    public LaptopUser(Laptop laptop) {
        this.laptop = laptop;
    }

    public void turnOnLaptop() {
        laptop.powerOn();
    }

    public void turnOffLaptop() {
        laptop.powerOff();
    }

    public void makeLaptopLouder() {
        laptop.volumeUp();
    }

    public void makeLaptopSilent() {
        laptop.volumeDown();
    }
}