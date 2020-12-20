package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void indexOf() {

        boolean finish = false;

        while(!finish) {

            int[] numbers = new int[App.arraySize()];

            for (int i = 0; i < numbers.length; i++) {
                int downInt = numbers.length - i;
                System.out.print("You have: " + downInt + " more numbers to enter. \n Please enter the number of array index [" + i + "]: ");
                Scanner numberScanner = new Scanner(System.in);
                numbers[i] = numberScanner.nextInt();
            }

            boolean play = true;

            while(play) {

                System.out.println("Lets play hide and seek. Type a number: ");
                Scanner scannerInputNumber = new Scanner(System.in);
                int inputNumber = scannerInputNumber.nextInt();

                Arrays.sort(numbers); //calling java.util
                int indexFound = Arrays.binarySearch(numbers, inputNumber);

                if (indexFound >= 0) {
                    System.out.println("The number "+numbers[indexFound]+" was found and has index place " + indexFound+".");
                    break;
                } else {
                    System.out.println("The number does not have a index number.");
                    System.out.print(" Do you want to try Again? (Y/N) ");

                    Scanner scannerPlay = new Scanner(System.in);
                    String inputFinish = scannerPlay.nextLine();

                    if (inputFinish.equalsIgnoreCase("N")) {
                        play = false;
                    }
                }
            }

            finish = App.yesOrNo();

        }
    }
}
