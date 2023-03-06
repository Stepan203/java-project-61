package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import static hexlet.code.Engine.numberOfRound;

public class Even {
    private static String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void runEven() {
        String[][] arrData = new String[numberOfRound][2];
        var i = 0;
        for (int j = 0; j < arrData.length; j++) {
            int rnd = Utils.rnd(10, 100);
            arrData[j][0] = String.valueOf(rnd);
            arrData[j][1] = isEven(rnd) ? "yes": "no";
            }
        Engine.start(DESCRIPTION, arrData);
    }
    private static boolean isEven(int rnd) {
        return rnd % 2 == 0;
    }
}
