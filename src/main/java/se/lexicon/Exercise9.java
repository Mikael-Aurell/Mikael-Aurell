package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise9 {

    public static void expandNumberArray() {

        boolean finish = false;

        while (!finish) {
            int[] expandArray = {1, 2, 3, 4, 5};
            int lengthOriginArray = expandArray.length;
            System.out.println("The Array has the length" + expandArray.length + ".");
            Scanner scannerNumber = new Scanner(System.in);
            System.out.println("Type a number to expand the array: ");
            int expandSize = scannerNumber.nextInt();
            expandArray = Arrays.copyOf(expandArray, expandArray.length + expandSize);
            System.out.println("Your new lenght of array is: " + expandArray.length);
            for (int i = 0; i <= expandSize - 1; i++) {
                int downInt = expandSize - i;
                System.out.print("You have: " + downInt + " more numbers to enter. ");
                Scanner numberScanner = new Scanner(System.in);
                expandArray[i + lengthOriginArray] = numberScanner.nextInt();
            }

            for (int i = 0; i < expandArray.length; i++) {
                System.out.print(expandArray[i] + ", ");
            }

            finish = App.yesOrNo();
        }
    }
}
