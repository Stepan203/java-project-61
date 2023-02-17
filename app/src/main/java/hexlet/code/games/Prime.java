package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUND;

public class Prime {
    private static String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static boolean charPrime(int a) {
        if (a > 1) {
            for (int i = 2; i <= Math.floor(Math.sqrt(a)); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    public static void runPrm() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        for (int j = 0; j < arrData.length; j++) {
            int rndPrime = Utils.rnd(2, 100);
            arrData[j][0] = String.valueOf(rndPrime);
            arrData[j][1] = charPrime(rndPrime) ? "yes": "no";
            }
        Engine.start(DESCRIPTION, arrData);

    }
}
