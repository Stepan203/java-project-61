package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.Prime;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Engine {
    public static int Col_round = 3;
    public static int NUMBER_OF_ROUND = 3;
    public static String Wel = "Welcome to the Brain Games!";
    public static String May_Name = "May I have your name? ";
    public static String Hello = "Hello, ";
    public static String Yes = "Correct!";
    public static String Cong = "Congratulations, ";
    public static String Ansver = "Your answer: ";
    public static String Choise = "Your choise: ";
    public static String Question = "Question: ";
    public static String Given_numbers = "Find the greatest common divisor of given numbers.";
    public static String Start_Calc = "What is the result of the expression?";
    public static String End_Game1 = " is wrong answer ;(. Correct answer was ";
    public static String End_Game2 = "Let's try again, ";
    //public static String Start_Even = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static String Start_Prime = "Answer 'yes' if the number is prime, otherwise answer 'no'.";
    public static String name;

    public static String hello() {
        System.out.println(Wel);
        Scanner scanner = new Scanner(System.in);
        System.out.print(May_Name);
        name = scanner.next();
        //System.out.println(Hello + name + "!");
        //setName(name);
        return Engine.Hello + Engine.name + "!";
    }

    public static void start(String description, String[][] arrData) {
        System.out.println(Wel);
        Scanner scanner = new Scanner(System.in);
        System.out.print(May_Name);
        name = scanner.next();
        System.out.println(Engine.Hello + Engine.name + "!");
        System.out.println(description);

        var j = 0;
        while (j < Engine.Col_round) {
            String question = arrData[j][0];
            String answer = arrData[j][1];
            System.out.println(Engine.Question + question);
            System.out.print(Engine.Ansver);
            String res = scanner.next();
            if (res.equals(answer)) {
              //  if (answer.equals("yes") || (Integer.valueOf(question) % 2 != 0 & answer.equals("no"))) {
                System.out.println(Engine.Yes);
                j += 1;
                }
                else {
                    System.out.println(res + Engine.End_Game1 + answer + "." + "\n" + Engine.End_Game2 + Engine.name + "!");
                    return;
                }

            }
        System.out.println(Engine.Cong + Engine.name + "!");
            }
}
