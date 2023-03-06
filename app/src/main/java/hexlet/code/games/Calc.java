
package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.CALCGAME;
import static hexlet.code.Engine.MINRAND;
import static hexlet.code.Engine.MAXRAND;

import hexlet.code.Utils;

public class Calc {
    private static String description = "What is the result of the expression?";
    private static String[] operators = new String[]{" - ", " * ", " + "};

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static void runCalc() {
        String[][] arrData = new String[CALCGAME][2];
        Random r = new Random();
        int[] arr = new int[2];
        var result = 0;
        for (int j = 0; j < arrData.length; j++) {
            int num1 = Utils.rnd(MINRAND, MAXRAND);
            int num2 = Utils.rnd(MINRAND, MAXRAND);
            int ind = r.nextInt(operators.length);
            switch (ind) {
                case 0:
                    result = sub(num1, num2);
                    break;
                case 1:
                    result = multi(num1, num2);
                    break;
                case 2:
                    result = add(num1, num2);
                    break;
                default:
                    System.out.println("Такого оператора нет!");
                    System.exit(0);
            }
            String question = num1 + operators[ind] + num2;
            arrData[j][0] = String.valueOf(question);
            arrData[j][1] = String.valueOf(result);
        }
        Engine.start(description, arrData);
    }
}
