package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Progress {
    private static int[] rnd;

    public static int[] prgArr() {
        int max = 6;
        int min = 1;
        int[] arr = new int[10];
        Random rd = new Random();
        int step = rd.nextInt(max - min);
        //Arrays.setAll(arr, i -> i + 1);
        for (int i = 0; i < arr.length; i+=step) {
            //for (int i: arr) {
            arr[i] = i + 1;
            //}
            // for (int i = 0; i < arr.length; i++)
            //{
            //     System.out.print(arr[i] + " ");
        }
        // arr[i] = (int) Math.round((Math.random() * 100));
        //  System.out.print(arr);
        // }
        return arr;
    }

    public static int getRandom(int[] arr) {
        int rnd = new Random().nextInt(arr.length);
        //System.out.println(arr[rnd]);
        return arr[rnd];
    }

    public static String prg() {
        Engine.hello();
        Random r = new Random();
        int min = 1;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        var i = 0;
        while (i < Engine.Col_round) {
            StringBuilder stringBuilder = new StringBuilder();
            int n1 = r.nextInt(max - min) + min;
            var ind_n = prgArr()[n1];
            System.out.println(Arrays.toString(prgArr()));
          //  System.out.println(ind_n);
            for (int j : prgArr()) {
                if (j == ind_n) {
                    stringBuilder.append(".. ");
                    continue;
                }
                stringBuilder.append(j).append(" ");
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
                //  System.out.println(res);
                System.out.println("Find the greatest common divisor of given numbers.");
            //}
       // }
            return Engine.Cong + Engine.name + "!";

    }
}


