package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import static hexlet.code.Engine.NUMBER_OF_ROUND;

public class Prime {
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean charPrime(int a) {
        for (int i = 2; i <= Math.floor(Math.sqrt(a)); i++) {
            if (a % i == 0) {
                return false;
            }
        }
            return true;
    }
    public static String yesNo(String bool) {
        if (bool.equals("no")) {
            return "yes";
        }
        else {
            return "no";
        }
    }
    public static void runPrm() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        Random r = new Random();
        int min = 1;
        int max = 10;
        var i = 0;
        while (i < Engine.Col_round) {
        for (int j = 0; j < arrData.length; j++) {
            int rndPrime = r.nextInt(100 - 2);
            arrData[j][0] = String.valueOf(rndPrime);
            arrData[j][1] = charPrime(rndPrime) ? "yes": "no";
            i += 1;
            }
        }
        Engine.start(description, arrData);

    }
}
