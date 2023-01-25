package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import static hexlet.code.Engine.NUMBER_OF_ROUND;

public class Even {
    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void runEven() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
       // System.out.println(Engine.Start_Even);
        Random r = new Random();
        int min = 10;
        int max = 100;
        var i = 0;
        while (i < Engine.Col_round) {
        for (int j = 0; j < arrData.length; j++) {
            int rnd = r.nextInt(max - min) + min;
            arrData[j][0] = String.valueOf(rnd);
            arrData[j][1] = isEven(rnd) ? "yes": "no";
            i += 1;
            }
        }
        Engine.start(description, arrData);
    }
    private static boolean isEven(int rnd) {
        return rnd % 2 == 0;
    }
}
