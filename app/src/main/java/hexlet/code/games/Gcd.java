package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;
public class Gcd {

    private static int n1;
    private static int n2;

    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static String gcd() {
        Engine.hello();
        Random r = new Random();
        int min = 10;
        int max = 100;
        Scanner scanner = new Scanner(System.in);
        var i = 0;
        while (i < Engine.Col_round) {
            int n1 = r.nextInt(max - min) + min;
            int n2 = r.nextInt(max - min) + min;
            System.out.println(Engine.Question + n1 + " " + n2);
            System.out.print(Engine.Ansver);
            int otd = scanner.nextInt();
            if (otd == gcdByBruteForce(n1, n2)) {
                System.out.println(Engine.Yes);
                i += 1;
            }
            else {
                return otd + " is wrong answer ;(. Correct answer was " + gcdByBruteForce(n1, n2) +"." +"\n" +
                        "Let's try again, " + Engine.name;
            }
        }
            System.out.println("Find the greatest common divisor of given numbers.");

            return Engine.Cong + Engine.name + "!";

    }
}
