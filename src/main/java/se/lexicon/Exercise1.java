package se.lexicon;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        addSingleArray();
    }

     public static void addSingleArray() {

        boolean firstTime = true;
        boolean finish = false;

         while(!finish) {



             if (firstTime) {
                 System.out.println("This little game prints the numbers you choose.");
             }
             else {
                 System.out.println("So Wonderful that you want to play my little game again! \n "+ "This little game prints the numbers you choose.");

             }

            System.out.print("Please choose the length of the array: ");
            Scanner intScanner = new Scanner(System.in);
            int size = intScanner.nextInt();

            int intArray[] = new int[size];

            System.out.println();



            for (int i = 0; i < intArray.length; i++) {
                int downInt = size-i;
                System.out.print("You have: " + downInt + " more numbers to enter. \n Please enter the number of array index [" + i + "]: ");
                intArray[i] = intScanner.nextInt();
            }

            System.out.print("Your numbers are:");

            for (int i = 0; i < intArray.length; i++) {
                System.out.print(" " + intArray[i]);
            }

            System.out.println();

            Scanner scannerFinish = new Scanner(System.in);
            System.out.print("Would you like to play again? (Y/N) ");
            String inputFinish = scannerFinish.nextLine();

            if (inputFinish.equalsIgnoreCase("N")) {
                finish = true;
            }
            else {firstTime = false;}
        }
         System.out.println("Thanks for playing this game!");
    }
}
