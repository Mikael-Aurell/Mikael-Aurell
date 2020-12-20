package se.lexicon;

import java.util.Scanner;

public class Exercise5 {
    public static void addValuesTwoDimensionalArray() {

        boolean finish = false;

        while (!finish) {

            int arraySize_ = 2;
            String[][] arrayTwoDim = new String[arraySize_][arraySize_];
            arrayTwoDim[0][0] = "Finland";
            arrayTwoDim[0][1] = "Helsinki";

            Scanner scannerCountry = new Scanner(System.in);
            System.out.print("Type a Country ");
            arrayTwoDim[1][0] = scannerCountry.nextLine();

            Scanner scannerCapital = new Scanner(System.in);
            System.out.print("Type the countries capital: ");
            arrayTwoDim[1][1] = scannerCapital.nextLine();
            System.out.println();

            System.out.println("List of");
            System.out.println("------------------------");
            System.out.println("Countries \tCapitols");
            for (int i = 0; i < arraySize_; i++) {
                for (int j = 0; j < arraySize_; j++) {
                    System.out.print(arrayTwoDim[i][j]+"   \t");
                }
                System.out.println();
            }
            System.out.println("------------------------");
            System.out.println();

            finish=App.yesOrNo();
        }
    }
}
