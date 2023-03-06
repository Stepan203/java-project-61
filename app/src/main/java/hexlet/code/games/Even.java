package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Engine.CALCGAME;
import static hexlet.code.Engine.MINRAND;
import static hexlet.code.Engine.MAXRAND;

public class Even {
    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEven() {
        String[][] arrData = new String[CALCGAME][2];
        var i = 0;
        for (int j = 0; j < arrData.length; j++) {
            int rnd = Utils.rnd(MINRAND, MAXRAND);
            arrData[j][0] = String.valueOf(rnd);
            arrData[j][1] = isEven(rnd) ? "yes" : "no";
        }
        Engine.start(description, arrData);
    }

    private static boolean isEven(int rnd) {
        return rnd % 2 == 0;
    }
}
