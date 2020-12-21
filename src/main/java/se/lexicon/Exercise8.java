package se.lexicon;

import java.util.Arrays;

public class Exercise8 {

    public static void removeDuplicateArray() {
        boolean finish = false;
        int j=0;
        while (!finish) {
            int[] numberArray = {0, 20, 40, 20, 30, 40, 50, 60, 50};
            System.out.println("The array numbers are : ");

            for (int numbers : numberArray
            ) {
                System.out.print(numbers + " ,");
            }
            System.out.println();
            Arrays.sort(numberArray);


            int[] uniqueNumbers = new int[0];
            for (int i = 0; i < numberArray.length; i++) {
                int tempNumber=0;
                if (!(i == numberArray.length-1)) {
                    tempNumber = numberArray[i] % numberArray[i + 1];
                }
                else {
                    tempNumber = numberArray[i-1] % numberArray[i];
                }

                if(i==0){
                    uniqueNumbers= Arrays.copyOf(uniqueNumbers, uniqueNumbers.length+1);
                    uniqueNumbers[j]=numberArray[i];
                    j++;
                }
                if(tempNumber != 0){
                    uniqueNumbers= Arrays.copyOf(uniqueNumbers, uniqueNumbers.length+1);
                    uniqueNumbers[j]=numberArray[i];
                    j++;
                }
            }

            Arrays.sort(uniqueNumbers);

            System.out.println("The uneven numbers are: ");
            for (int number: uniqueNumbers) {
                System.out.print(number + ", ");
            }

            System.out.println();
            j=0;

            finish = App.yesOrNo();
        }
    }
}
