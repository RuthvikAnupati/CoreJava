
package com.javafundamentals.logical_statements.loops;

import java.util.Random;
import java.util.Scanner;

public class RandomNumGame_10_11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int randNum = r.nextInt(100) + 1;
        boolean isGuessed = false;

        System.out.println("===== RANDOM NUMBER GUESSING GAME =====");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have only 3 chances!");

        for (int i = 1; i <= 3; i++) {

            System.out.print("\nAttempt " + i + "/3 - Enter your guess: ");
            int guess = sc.nextInt();

            // Validate input range
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid Guess! Enter a number between 1 and 100.");
                i--;
                continue;
            }

            if (guess == randNum) {
                System.out.println("Congratulations! You guessed the correct number.");
                isGuessed = true;
                break;
            }
            else if (guess < randNum) {
                System.out.println("Too Low! Try Again.");
            }
            else {
                System.out.println("Too High! Try Again.");
            }

            System.out.println("Chances remaining: " + (3 - i));
        }

        if (!isGuessed) {
            System.out.println("\nGame Over!");
            System.out.println("The correct number was: " + randNum);
        }

        sc.close();
    }
}
