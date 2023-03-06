package hexlet.code;

//import hexlet.code.games.Even;
//import hexlet.code.games.Prime;

//import java.util.Random;
import java.util.Scanner;
//import java.util.Arrays;

public class Engine {
    public static int QUANTITY_ROUND = 3;
    public static int NumberOfRound = 3;
    public static String Welc = "Welcome to the Brain Games!";
    public static String MayName = "May I have your name? ";
    public static String Hello = "Hello, ";
    public static String YES = "Correct!";
    public static String CONG = "Congratulations, ";
    public static String ANSWER = "Your answer: ";
    public static String CHOISE = "Your choise: ";
    public static String QUESTION = "Question: ";
    public static String GIVEN_NUMBERS = "Find the greatest common divisor of given numbers.";
    public static String START_CALC = "What is the result of the expression?";
    public static String END_GAME1 = " is wrong answer ;(. Correct answer was ";
    public static String END_GAME2 = "Let's try again, ";
    public static String START_PRIME = "Answer 'yes' if the number is prime, otherwise answer 'no'.";

    public static void hello() {
        System.out.println(Welc);
        Scanner scanner = new Scanner(System.in);
        System.out.print(MayName);
        String name = scanner.next();
        System.out.println(Engine.Hello + name + "!");
        //return Engine.HELLO + name + "!";
    }

    public static void start(String description, String[][] arrData) {
        System.out.println(Welc);
        Scanner scanner = new Scanner(System.in);
        System.out.print(MayName);
        String name = scanner.next();
        System.out.println(Engine.Hello + name + "!");
        System.out.println(description);

        var j = 0;
        while (j < Engine.QUANTITY_ROUND) {
            String question = arrData[j][0];
            String answer = arrData[j][1];
            System.out.println(Engine.QUESTION + question);
            System.out.print(Engine.ANSWER);
            String res = scanner.next();
            if (res.equals(answer)) {
                System.out.println(Engine.YES);
                j += 1;
            } else {
                System.out.println(res + Engine.END_GAME1 + answer + "." + "\n" + Engine.END_GAME2 + name + "!");
                return;
            }
        }
        System.out.println(Engine.CONG + name + "!");
    }
}
