package com.pluralsight;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Array of quotes
        String[] quotes = {
                "Two things are infinite: the universe and human stupidity. – Albert Einstein",
                "So many books, so little time. – Frank Zappa",
                "A room without books is like a body without a soul. – Cicero",
                "Be the change that you wish to see in the world. – Mahatma Gandhi",
                "In three words I can sum up everything I've learned about life: it goes on. – Robert Frost",
                "If you tell the truth, you don't have to remember anything. – Mark Twain",
                "Always forgive your enemies; nothing annoys them so much. – Oscar Wilde",
                "May your heart remain breakable, but never by the same hand twice. – Taylor Swift",
                "That which does not kill us makes us stronger. – Friedrich Nietzsche",
                "The C Programming Language doesn't teach you everything. It teaches you how to learn anything. – Unknown"
        };

        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("\nFamous Quotes");
            System.out.println("1-10: View a specific quote");
            System.out.println("0: View a random quote");
            System.out.print("Enter your choice: "); //Prompt the user to select a number between 1 and 10.

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                //Find the quote in the array
                if (choice == 0) {
                    int randomIndex = random.nextInt(quotes.length);
                    System.out.println("Random Quote: " + quotes[randomIndex]);
                } else if (choice >= 1 && choice <= 10) {
                    System.out.println("Quote #" + choice + ": " + quotes[choice - 1]);
                } else {
                    System.out.println("Please enter a number between 1 and 10, or 0 for a random quote.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }

            //loop to see a different quote
            System.out.print("\nWould you like to see another quote? (yes/no): ");
            String again = scanner.nextLine().trim().toLowerCase();
            if (!again.equals("yes")) {
                continueProgram = false;
                System.out.println("Thanks for reading quotes! Goodbye.");
            }
        }

        scanner.close();
    }
}
