package com.nic.luckystarcasino;

import java.util.Scanner;
import java.util.Random;

public class SlotMachine {

    static void main(String[] args) {

        //  JAVA SLOT MACHINE
        Scanner scanner = new Scanner(System.in);
        int balance = 1000;
        int bet;
        int payout;
        String[] row;

        //  DISPLAY WELCOME MESSAGE (Welcome to Sarsaparilla Slots!)
        System.out.println("************************************");
        System.out.println("   Welcome to Sarsaparilla Slots!   ");
        System.out.println("      Symbols: 🍾 🤠 🐎 🌟 🔫");
        System.out.println("**************************************");


        //  PLAY IF BALANCE >0

        while (balance > 0) {
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be greater than 0");
            } else {
                balance -= bet;
                System.out.println("$" + balance);
            }

            //  SPIN ROW
            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);

            //  PRINT ROW OF EMOJIS
            //  GET A PAYOUT
            //  ASK TO PLAY AGAIN
            //  DISPLAY EXIT MESSAGE

        }
        scanner.close();
    }
        static String[] spinRow() {

            String[] symbols = {"🍾", "🤠", "🐎", "🌟", "🔫"};
            String[] row = new String[3];
            Random random = new Random();



            for(int i = 0; i < 3; i++) {
                row[i] = symbols[random.nextInt(symbols.length)];
            }

            return row;
        }
        static void printRow(String[] row) {
            System.out.println("***************");
            System.out.println(" " + String.join(" | ", row));
            System.out.println("***************");
        }
}
