package se.lexicon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise4 {
    public static void copyStringArray() {

        boolean finish = false;

        while (!finish) {

            String[] countries = new String[App.arraySize()];

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
            finish = App.yesOrNo();
        }
    }
}
