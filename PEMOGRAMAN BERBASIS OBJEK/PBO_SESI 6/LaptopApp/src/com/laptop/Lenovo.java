package com.laptop;

public class Lenovo implements Laptop {

    private int volume;
    private boolean isPowerOn;

    public Lenovo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Lenovo menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Lenovo mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume += 10;
            System.out.println("Volume Lenovo: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume -= 10;
            System.out.println("Volume Lenovo: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }
}