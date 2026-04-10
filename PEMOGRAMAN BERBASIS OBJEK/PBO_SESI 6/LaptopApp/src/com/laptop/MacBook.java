package com.laptop;

public class MacBook implements Laptop {

    private int volume;
    private boolean isPowerOn;

    public MacBook() {
        this.volume = 60;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("MacBook menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("MacBook mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume += 2;
            System.out.println("Volume MacBook: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume -= 2;
            System.out.println("Volume MacBook: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }
}