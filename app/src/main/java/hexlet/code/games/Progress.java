package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

//import java.util.Arrays;
import java.util.Random;
//import java.util.Scanner;

import static hexlet.code.Engine.CALCGAME;
import static hexlet.code.Engine.MINRAND;
import static hexlet.code.Engine.MAXRAND;

public class Progress {
    private static String description = "What number is missing in the progression?";

    public static int[] generateProgression() {
       // int max = 10;
      //  int min = 2;
        int[] arr = new int[MINRAND];
        Random rd = new Random();
        int step = rd.nextInt(MINRAND - 2);
        int start = rd.nextInt(MAXRAND - MINRAND - MINRAND);
        arr[0] = start;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + step;
        }
        return arr;
    }

    public static void runPrg() {
        String[][] arrData = new String[CALCGAME][2];
        for (int n = 0; n < arrData.length; n++) {
            StringBuilder stringBuilder = new StringBuilder();
            int n1 = Utils.rnd(1, MINRAND);
            int[] arrPrg = generateProgression();
            var indN = arrPrg[n1];
            for (int j = 0; j < arrPrg.length; j++) {
                if (j == n1) {
                    stringBuilder.append(".. ");
                    continue;
                }
                stringBuilder.append(arrPrg[j]).append(" ");
            }
            arrData[n][0] = String.valueOf(stringBuilder);
            arrData[n][1] = String.valueOf(indN);
        }
        Engine.start(description, arrData);
    }
}


