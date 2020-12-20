package se.lexicon;

public class Exercise6 {
    public static void averageIntArray() {
        boolean finish = false;

        while (!finish) {
            int[] numberArray = {43, 5, 23, 17, 2, 14};
            System.out.println("The array numbers are : ");

            for (int numbers : numberArray
            ) {
                System.out.print(numbers + ",");
            }
            System.out.println();

            double sum = 0;
            for (int i = 0; i < numberArray.length; i++) {
                sum = sum + numberArray[i];
            }
            double averageNumber = sum / numberArray.length;

            System.out.println("The average is: ");
            System.out.printf("%.1f", averageNumber);
            System.out.println();

            finish = App.yesOrNo();
        }
    }
}
