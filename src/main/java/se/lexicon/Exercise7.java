package se.lexicon;

import java.util.Arrays;

public class Exercise7 {
    public static void unevenIntArray() {
        boolean finish = false;
        int j=0;
        while (!finish) {
            int[] numberArray = {43, 5, 23, 17, 2, 14, 7, 8, 9, 7};
            System.out.println("The array numbers are : ");

            for (int numbers : numberArray
            ) {
                System.out.print(numbers + " ,");
            }
            System.out.println();

            int[] unEvenNumbers = new int[0];
            for (int i = 0; i < numberArray.length; i++) {
                int tempNumber = numberArray[i] % 2;

                if(tempNumber != 0){
                    unEvenNumbers= Arrays.copyOf(unEvenNumbers, unEvenNumbers.length+1);
                    unEvenNumbers[j]=numberArray[i];
                    j++;
                }
            }

            System.out.println("The uneven numbers are: ");
            for (int number: unEvenNumbers) {
                System.out.print(number + ", ");
            }

            System.out.println();
            j=0;

            finish = App.yesOrNo();

        }
    }
}
