package com.laptop;

public class Toshiba implements Laptop {

    private int volume;
    private boolean isPowerOn;

    public Toshiba() {
        this.volume = 40;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Toshiba menyala...");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Toshiba mati...");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            volume += 5;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            volume -= 5;
            System.out.println("Volume Toshiba: " + volume);
        } else {
            System.out.println("Nyalakan laptop terlebih dahulu!");
        }
    }
}