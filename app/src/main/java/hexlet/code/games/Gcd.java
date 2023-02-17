package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import hexlet.code.Utils;

import static hexlet.code.Engine.NUMBER_OF_ROUND;

public class Gcd {
    private static String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void runGcd() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        for (int j = 0; j < arrData.length; j++) {
            int n1 = Utils.rnd(10, 100);
            int n2 = Utils.rnd(10, 100);
            String question = n1 + " " + n2;
            arrData[j][0] = String.valueOf(question);
            arrData[j][1] = String.valueOf(gcdByBruteForce(n1, n2));
            }
        Engine.start(DESCRIPTION, arrData);
    }
}
