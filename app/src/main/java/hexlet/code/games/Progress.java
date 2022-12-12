package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progress {

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
    public static String prg() {
        Engine.hello();
        Random r = new Random();
        int min = 1;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        var i = 0;
        int n1 = r.nextInt(10 - 2);

        while (i < Engine.Col_round) {
            StringBuilder stringBuilder = new StringBuilder();
            int[] arr_prg = prgArr();
            var ind_n = arr_prg[n1];

            for(int j = 0; j < arr_prg.length; j++) {
                if (j == n1) {
                    stringBuilder.append(".. ");
                    continue;
                }
                stringBuilder.append(arr_prg[j]).append(" ");
            }
            System.out.println(Engine.Question + stringBuilder);
            System.out.print(Engine.Ansver);
            int otd = scanner.nextInt();
            if (otd == ind_n) {
                System.out.println(Engine.Yes);
                i += 1;
            } else {
                return otd + " is wrong answer ;(. Correct answer was " + ind_n + "." + "\n" +
                        "Let's try again, " + Engine.name;
            }
        }
                System.out.println("Find the greatest common divisor of given numbers.");

            return Engine.Cong + Engine.name + "!";

    }
}


