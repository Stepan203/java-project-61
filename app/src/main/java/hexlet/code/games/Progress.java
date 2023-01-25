package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import static hexlet.code.Engine.NUMBER_OF_ROUND;

public class Progress {
    private static String description = "What number is missing in the progression?";
    public static int[] prgArr() {
        int max = 10;
        int min = 2;
        int[] arr = new int[10];
        Random rd = new Random();
        int step = rd.nextInt(max - min);
        int start = rd.nextInt(90 - 10);
        arr[0] = start;
        for (int i = 1; i < arr.length; i ++) {
            arr[i] = arr[i - 1] + step;
        }
        return arr;
    }
    public static void runPrg() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        Random r = new Random();
        int min = 1;
        int max = 10;
        var i = 0;

        while (i < Engine.Col_round) {
            for (int n = 0; n < arrData.length; n++) {
                StringBuilder stringBuilder = new StringBuilder();
                int n1 = r.nextInt(10 - 2);
                int[] arr_prg = prgArr();
                var ind_n = arr_prg[n1];

                for (int j = 0; j < arr_prg.length; j++) {
                    if (j == n1) {
                        stringBuilder.append(".. ");
                        continue;
                    }
                    stringBuilder.append(arr_prg[j]).append(" ");
                    arrData[n][0] = String.valueOf(stringBuilder);
                    arrData[n][1] = String.valueOf(ind_n);
                    i += 1;
                }
            }
            Engine.start(description, arrData);
        }
    }
}


