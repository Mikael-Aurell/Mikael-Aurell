package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise3 {
    public static void sortStringArray() {

        boolean finish = false;

        while (!finish) {

            String[] capitals = new String[App.arraySize()];

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
            finish = App.yesOrNo();
        }
    }
}
