package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    public static boolean charPrime(int a) {
        for (int i = 2; i <= Math.floor(Math.sqrt(a)); i++) {
            if (a % i == 0) {
                return false;
            }
        }
            return true;
    }
    public static String yesNo(String bool) {
        if (bool.equals("no")) {
            return "yes";
        }
        else {
            return "no";
        }
    }
    public static String prm() {
        Engine.hello();
        Random r = new Random();
        int min = 1;
        int max = 10;
        Scanner scanner = new Scanner(System.in);
        var i = 0;
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");
        while (i < Engine.Col_round) {
            int rndPrime = r.nextInt(100 - 2);
            System.out.println(Engine.Question + rndPrime);
            System.out.print(Engine.Choise);
            String otd = scanner.next();
            //System.out.println(Engine.Choise + otd);
            if ((charPrime(rndPrime) & otd.equals("yes")) || (!charPrime(rndPrime) & otd.equals("no"))) {
                System.out.println(Engine.Yes);
                    i += 1;
            } else {
                return otd + " is wrong answer ;(. Correct answer was "  + yesNo(otd) + ".\n" +
                                "Let's try again, " + Engine.name;
                    }
        }
        System.out.println("Find the greatest common divisor of given numbers.");

        return Engine.Cong + Engine.name + "!";

    }
}
