package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final String WELCOME = "Welcome to the Brain Games!";
    public static final String MAYNAME = "May I have your name? ";
    public static final String HELLO = "Hello, ";
    public static final String YES = "Correct!";
    public static final String CONFGRATULATIONS = "Congratulations, ";
    public static final String ANSWERS = "Your answer: ";
    public static final String CHOISE = "Your choise: ";
    public static final String QUESTIONS = "Question: ";

    public static final String STARTCALC = "What is the result of the expression?";
    public static final String ENDGAME1 = " is wrong answer ;(. Correct answer was ";
    public static final String ENDGAME2 = "Let's try again, ";

    public static final int CALCGAME = 3;
    public static final int MINRAND = 10;
    public static final int MAXRAND = 100;

    public static void hello() {
        System.out.println(WELCOME);
        Scanner scanner = new Scanner(System.in);
        System.out.print(MAYNAME);
        String name = scanner.next();
        System.out.println(Engine.HELLO + name + "!");
    }

    public static void start(String description, String[][] arrData) {
        System.out.println(WELCOME);
        Scanner scanner = new Scanner(System.in);
        System.out.print(MAYNAME);
        String name = scanner.next();
        System.out.println(Engine.HELLO + name + "!");
        System.out.println(description);

        var j = 0;
        while (j < Engine.CALCGAME) {
            String question = arrData[j][0];
            String answer = arrData[j][1];
            System.out.println(Engine.QUESTIONS + question);
            System.out.print(Engine.ANSWERS);
            String res = scanner.next();
            if (res.equals(answer)) {
                System.out.println(Engine.YES);
                j += 1;
            } else {
                System.out.println(res + Engine.ENDGAME1 + answer + "." + "\n" + Engine.ENDGAME2 + name + "!");
                return;
            }
        }
        System.out.println(Engine.CONFGRATULATIONS + name + "!");
    }
}
