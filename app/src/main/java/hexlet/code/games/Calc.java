
package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
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
    public static String calc() {
        Engine.hello();
        Engine calcName = new Engine();
        System.out.println("What is the result of the expression?");
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[2];
        String[] myString = new String[]{" - ", " * ", " + "};
        int min = 10;
        int max = 100;
        var i = 0;
        var result = 0;
        while (i < Engine.Col_round) {
            int a = r.nextInt(max - min) + min;
            int b = r.nextInt(max - min) + min;
            System.out.println(Engine.Question + a + myString[i] + b);
            if (myString[i] == " + ") {
                result = add(a, b);
            } else if (myString[i] == " - ") {
                result = sub(a, b);
            } else {
                result = multi(a, b);
            }
            System.out.print(Engine.Ansver);
            int otd = scanner.nextInt();
            if (otd == result) {
                System.out.println(Engine.Yes);
                i += 1;
            } else {
                return otd + " is wrong answer ;(. Correct answer was " + result +"." +"\n" +
                        "Let's try again, " + Engine.name;
                 }
                 }
                return Engine.Cong + Engine.name + "!";
            }
        }
