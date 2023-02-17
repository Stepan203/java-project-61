
package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.START_CALC;
import hexlet.code.Utils;

public class Calc {
    private static String DESCRIPTION = "What is the result of the expression?";
    private static String[] myString = new String[]{" - ", " * ", " + "};
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int sub(int a, int b)
    {
        return a - b;
    }
    public static int multi(int a, int b)
    {
        return a * b;
    }
    public static void runCalc() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        Random r = new Random();
        int[] arr = new int[2];
        var result = 0;
        for (int j = 0; j < arrData.length; j++) {
            int a = Utils.rnd(10, 100);
            int b = Utils.rnd(10, 100);
            int ind = r.nextInt(myString.length);
                switch (ind) {
                    case 0:
                        result = sub(a, b);
                        break;
                    case 1:
                        result = multi(a, b);
                        break;
                    case 2:
                        result = add(a, b);
                        break;
                    default:
                        System.out.println("Такого оператора нет!");
                        System.exit(0);
            }
            String question = a + myString[ind] + b;
            arrData[j][0] = String.valueOf(question);
            arrData[j][1] = String.valueOf(result);
            }
        Engine.start(DESCRIPTION, arrData);
    }
}
