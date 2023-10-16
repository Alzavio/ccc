

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Set a pass cost: ");
        double response = myObj.nextDouble();
        System.out.println("");

        MovieClub[] MovieClubs = {
                new SeniorClub(response),
                new GoldClub(response),
                new PlatinumClub(response),
                new PlatinumPlus(response)
        };

        for (int i = 0; i < 4; i++) {
            System.out.println(
                    MovieClubs[i].toString()
            );
        }

    }
}