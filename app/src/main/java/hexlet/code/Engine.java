package hexlet.code;

//import hexlet.code.games.Even;
//import hexlet.code.games.Prime;

//import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

public class Engine {
   // public static int roundCol = 3;
    public static int numberOfRound = 3;
    public static String welc = "Welcome to the Brain Games!";
    public static String mayName = "May I have your name? ";
    public static String hello = "Hello, ";
    public static String yes = "Correct!";
    public static String conf = "Congratulations, ";
    public static String answers = "Your answer: ";
    public static String choise = "Your choise: ";
    public static String questions = "Question: ";
    public static String givenNumbers = "Find the greatest common divisor of given numbers.";
    public static String startCalc = "What is the result of the expression?";
    public static String endGame1 = " is wrong answer ;(. Correct answer was ";
    public static String endGame2 = "Let's try again, ";
    public static String startPrime = "Answer 'yes' if the number is prime, otherwise answer 'no'.";

    public static final int calcGame = 3;
    public static final int minRand = 10;
    public static final int maxRand = 100;

    public static void hello() {
        System.out.println(welc);
        Scanner scanner = new Scanner(System.in);
        System.out.print(mayName);
        String name = scanner.next();
        System.out.println(Engine.hello + name + "!");
        //return Engine.HELLO + name + "!";
    }

    public static void start(String description, String[][] arrData) {
        System.out.println(welc);
        Scanner scanner = new Scanner(System.in);
        System.out.print(mayName);
        String name = scanner.next();
        System.out.println(Engine.hello + name + "!");
        System.out.println(description);

        var j = 0;
        while (j < Engine.numberOfRound) {
            String question = arrData[j][0];
            String answer = arrData[j][1];
            System.out.println(Engine.questions + question);
            System.out.print(Engine.answers);
            String res = scanner.next();
            if (res.equals(answer)) {
                System.out.println(Engine.yes);
                j += 1;
            } else {
                System.out.println(res + Engine.endGame1 + answers + "." + "\n" + Engine.endGame2 + name + "!");
                return;
            }
        }
        System.out.println(Engine.conf + name + "!");
    }
}
