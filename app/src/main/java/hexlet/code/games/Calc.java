
package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import static hexlet.code.Engine.NUMBER_OF_ROUND;
import static hexlet.code.Engine.start;

public class Calc {
    private static String description = "What is the result of the expression?";
    private static int b;
    private static int a;
        public static int add(int a, int b) {
            return a + b;
        }
        public static int sub(int a, int b){

            return a - b;
        }
        public static int multi(int a, int b){

            return a * b;
        }
    public static void runCalc() {
        String[][] arrData = new String[NUMBER_OF_ROUND][2];
        Random r = new Random();
        int[] arr = new int[2];
        String[] myString = new String[]{" - ", " * ", " + "};
        int min = 10;
        int max = 100;
        var i = 0;
        var result = 0;
        for (int j = 0; j < arrData.length; j++) {
            int a = r.nextInt(max - min) + min;
            int b = r.nextInt(max - min) + min;
            if (myString[i] == " + ") {
                result = add(a, b);
            } else if (myString[i] == " - ") {
                result = sub(a, b);
            } else {
                result = multi(a, b);
            }
            String question = a + myString[i] + b;
            arrData[j][0] = String.valueOf(question);
            arrData[j][1] = String.valueOf(result);
            i += 1;
            }
        Engine.start(description, arrData);
    }
}
