package com.nic.luckystarcasino;

import java.util.Scanner;

public class CasinoApplication {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 1000;


        System.out.println("=== Lucky Star Casino ===");
        System.out.println("Welcome to the Lucky Star Casino Partner!");
        System.out.println("Balance =  $" + balance);

        System.out.println("Please select an option:");
        System.out.println("1: Play slots");
        System.out.println("2: Quit");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Slow down there cowboy! Slots coming soon.");
        } else if (choice == 2) {
            System.out.println("See you around!");
        } else {
            System.out.println("Invalid option");
        }

        scanner.close();

    }

}
