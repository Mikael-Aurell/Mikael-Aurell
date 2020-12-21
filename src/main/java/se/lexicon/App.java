package se.lexicon;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        boolean end = false;
        String inputFinish;
        do {
            System.out.println("-----------List of Games----------------------");
            System.out.println("0 = Exit");
            System.out.println("1 = SingleArray (Exercise1)");
            System.out.println("2 = IndexOf (Exercise2)");
            System.out.println("3 = SortStringArray (Exercise3)");
            System.out.println("4 = CopyArray (Exercise4)");
            System.out.println("5 = AddValuesTwoDimensionalArray (Exercise5)");
            System.out.println("6 = AverageIntArray (Exercise6)");
            System.out.println("7 = UnevenIntArray (Exercise7)");
            System.out.println("8 = RemoveDuplicateArray (Exercise8)");
            System.out.println("9 = ExpandNumberArray (Exercise9)");
            System.out.println("-----------Copyright Aurell-Gaming------------");
            System.out.println();
            System.out.print(" Choose Which game above you want to play or exit: ");

            Scanner scannerChoice = new Scanner(System.in);
            String gameChoice = scannerChoice.nextLine();

            switch (gameChoice) {
                case "1":
                    Exercise1.addSingleArray();
                    break;
                case "2":
                    Exercise2.indexOf();
                    break;
                case "3":
                    Exercise3.sortStringArray();
                    break;
                case "4":
                    Exercise4.copyStringArray();
                    break;
                case "5":
                    Exercise5.addValuesTwoDimensionalArray();
                    break;
                case "6":
                    Exercise6.averageIntArray();
                    break;
                case "7":
                    Exercise7.unevenIntArray();
                    break;
                case "8":
                    Exercise8.removeDuplicateArray();
                    break;
                case "9":
                    Exercise9.expandNumberArray();
                    break;
                case "0":
                    end = true;
                    break;

                default:
                    System.out.println(gameChoice + "is not supported. You can only type digits 1-13");
            }

            if(end) break;

            Scanner scannerFinish = new Scanner(System.in);
            System.out.print("Would you like to list the games again? (Y/N) ");
            inputFinish = scannerFinish.nextLine();
        }
        while (!inputFinish.equalsIgnoreCase("N"));

        System.out.println("Thanks for playing this game!");
    }


    public static int arraySize() {
        int size;
        System.out.print("Please choose the length of the array: ");
        Scanner intScanner = new Scanner(System.in);
        size = intScanner.nextInt();
        return size;
    }

    public static boolean yesOrNo() {
        System.out.print("Do you want to play Again? (Y/N) ");
        Scanner scannerYesOrNo = new Scanner(System.in);
        String inputFinish = scannerYesOrNo.nextLine();

        return inputFinish.equalsIgnoreCase("N");
    }
}