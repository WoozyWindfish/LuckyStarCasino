package com.nic.luckystarcasino;

import java.util.Scanner;

public class CasinoApplication {

    static void main(String[] args) {

        Scanner scanner new Scanner(System.in);

        int balance = 1000;


        System.out.println("=== Lucky Star Casino ===");
        System.out.println("Welcome to the Lucky Star Casino Partner!");
        System.out.println("Balance =  $" + balance);

        System.out.println("1: Play slots");
        System.out.println("2: Quit");
        System.out.println("Please select");

        int choice = scanner.nextInt();

    }

}
