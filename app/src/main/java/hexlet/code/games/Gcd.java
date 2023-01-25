package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

import static hexlet.code.Engine.NUMBER_OF_ROUND;

public class Gcd {
    private static String description = "Find the greatest common divisor of given numbers.";
    private static int n1;
    private static int n2;

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }
    public static void runGcd() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        Random r = new Random();
        int min = 10;
        int max = 100;
        var i = 0;
        while (i < Engine.Col_round) {
            for (int j = 0; j < arrData.length; j++) {
                int n1 = r.nextInt(max - min) + min;
                int n2 = r.nextInt(max - min) + min;
                String question = n1 + " " + n2;
                arrData[j][0] = String.valueOf(question);
                arrData[j][1] = String.valueOf(gcdByBruteForce(n1, n2));
                i += 1;
            }
        }
        Engine.start(description, arrData);
    }
}
