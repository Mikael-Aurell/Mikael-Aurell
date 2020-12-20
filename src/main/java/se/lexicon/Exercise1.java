package se.lexicon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise1 {
    public static void main(String[] args) {

        String inputFinish;

        do {
            System.out.println("-----------List of Games----------------------");
            System.out.println("0 = Exit");
            System.out.println("1 = SingleArray (Exercise1)");
            System.out.println("2 = IndexOf (Exercise2)");
            System.out.println("3 = SortStringArray (Exercise3)");
            System.out.println("4 = CopyArray Exercise4");
            System.out.println("-----------Copyright Aurell-Gaming------------");
            System.out.println();
            System.out.print(" Choose Which game above you want to play or exit: ");

            Scanner scannerChoice = new Scanner(System.in);
            String gameChoice = scannerChoice.nextLine();

            switch (gameChoice) {
                case "1":
                    addSingleArray();
                    break;

                case "2":
                    indexOf();
                    break;
                case "3":
                    sortStringArray();
                    break;
                case "4":
                    copyStringArray();
                    break;
                case "0":
                    break;

                default:
                    System.out.println(gameChoice + "is not supported. You can only type digits 1-13");
            }

            Scanner scannerFinish = new Scanner(System.in);
            System.out.print("Would you like to list the games again? (Y/N) ");
            inputFinish = scannerFinish.nextLine();
            }
            while (!inputFinish.equalsIgnoreCase("N"));

        System.out.println("Thanks for playing this game!");
    }


    public static void addSingleArray() {

        boolean firstTime = true;
        boolean finish = false;

         while(!finish) {

             if (firstTime) {
                 System.out.println("This little game prints the numbers you choose.");
             } else {
                 System.out.println("So Wonderful that you want to play my little game again! \n " + "This little game prints the numbers you choose.");

             }

             int[] intArray = new int[arraySize()];

             System.out.println();


             for (int i = 0; i < intArray.length; i++) {
                 int downInt = intArray.length - i;
                 System.out.print("You have: " + downInt + " more numbers to enter. \n Please enter the number of array index [" + i + "]: ");
                 Scanner intScanner = new Scanner(System.in);
                 intArray[i] = intScanner.nextInt();
             }

             System.out.print("Your numbers are:");

             for (int j : intArray) {
                 System.out.print(" " + j);
             }

             System.out.println();

             finish = yesOrNo();

             if (!finish) {
                 firstTime = false;
             }
         }
    }

    public static void indexOf() {
        /*  Create a program and create a method with name ‘indexOf’ which will find and return the index
            of an element in the array. If the element does not exist your method should return -1 as value.
            Expected output:Index position of number 5 is: 2
        */
        boolean finish = false;

        while(!finish) {

            int[] numbers = new int[arraySize()];

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

            finish = yesOrNo();

        }
    }

    public static void sortStringArray() {

        boolean finish = false;

        while (!finish) {

            String[] capitals = new String[arraySize()];

            IntStream.range(0, capitals.length).forEach(i -> {
                int downInt = capitals.length - i;
                System.out.print("You have: " + downInt + " more strings to enter. \n Please enter the string of array index [" + i + "]: ");
                Scanner capitalScanner = new Scanner(System.in);
                capitals[i] = capitalScanner.nextLine();
            });

            Arrays.sort(capitals);

            for (String string_ : capitals) {
             System.out.println(string_);
            }
            finish = yesOrNo();
        }
    }

    public static void copyStringArray() {

        boolean finish = false;

        while (!finish) {

            String[] countries = new String[arraySize()];

            IntStream.range(0, countries.length).forEach(i -> {
                int downInt = countries.length - i;
                System.out.print("You have: " + downInt + " more Countries to enter. \n Please enter the Countries of array index [" + i + "]: ");
                Scanner capitalScanner = new Scanner(System.in);
                countries[i] = capitalScanner.nextLine();
            });

            String[] copyCountries = (Arrays.copyOf(countries, countries.length));

            for (String string_ : copyCountries) {
                System.out.println(string_);
            }
            finish = yesOrNo();
        }
    }


        //Methods here that reuses in the different games methods
        public static int arraySize(){
            int size;
            System.out.print("Please choose the length of the array: ");
            Scanner intScanner = new Scanner(System.in);
            size = intScanner.nextInt();
            return size;
        }
        public static boolean yesOrNo(){
            System.out.println("Do you want to play Again? (Y/N)");
            Scanner scannerYesOrNo = new Scanner(System.in);
            String inputFinish = scannerYesOrNo.nextLine();

            return inputFinish.equalsIgnoreCase("N");
        }
}


