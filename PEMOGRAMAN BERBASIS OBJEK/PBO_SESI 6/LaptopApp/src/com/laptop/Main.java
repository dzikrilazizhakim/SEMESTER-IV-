package com.laptop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pilih salah satu laptop (contoh: Lenovo)
        Laptop laptop = new Lenovo();
        LaptopUser user = new LaptopUser(laptop);

        String command;

        System.out.println("=== PROGRAM INTERFACE LAPTOP ===");

        do {
            System.out.println("\nKetik perintah:");
            System.out.println("ON   -> Menyalakan Laptop");
            System.out.println("OFF  -> Mematikan Laptop");
            System.out.println("UP   -> Menambah Volume");
            System.out.println("DOWN -> Mengurangi Volume");
            System.out.println("EXIT -> Keluar Program");

            System.out.print("Input: ");
            command = input.nextLine().toUpperCase();

            switch (command) {
                case "ON":
                    user.turnOnLaptop();
                    break;
                case "OFF":
                    user.turnOffLaptop();
                    break;
                case "UP":
                    user.makeLaptopLouder();
                    break;
                case "DOWN":
                    user.makeLaptopSilent();
                    break;
                case "EXIT":
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Perintah tidak dikenali!");
            }

        } while (!command.equals("EXIT"));

        input.close();
    }
}