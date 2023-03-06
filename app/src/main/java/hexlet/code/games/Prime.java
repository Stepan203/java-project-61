package hexlet.code.games;

import hexlet.code.Engine;

//import java.util.Random;
//import java.util.Scanner;
//import java.util.Arrays;
import hexlet.code.Utils;

import static hexlet.code.Engine.numberOfRound;

public class Prime {
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        } else if (a > 1) {
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
        String[][] arrData = new String[numberOfRound][2];
        for (int j = 0; j < arrData.length; j++) {
            int rndPrime = Utils.rnd(2, Engine.maxRand);
            arrData[j][0] = String.valueOf(rndPrime);
            arrData[j][1] = isPrime(rndPrime) ? "yes" : "no";
        }
        Engine.start(description, arrData);

    }
}
