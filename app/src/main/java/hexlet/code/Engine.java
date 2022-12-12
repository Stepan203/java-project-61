package hexlet.code;
import hexlet.code.games.Even;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static int Col_round = 3;
    public static String Wel = "Welcome to the Brain Games!";
    public static String May_Name = "May I have your name? ";
    public static String Hello = "Hello, ";
    public static String Yes = "Correct!";
    public static String Cong = "Congratulations ";
    public static String Ansver = "Your answer: ";
    public static String Choise = "Your choise: ";
    public static String Question = "Question: ";
    public static String Given_numbers = "Find the greatest common divisor of given numbers.";


    public static String name;
    //private String name;
   /* public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name = newName;
    }*/
    //private String name;
    public static String hello() {
        System.out.println(Wel);
        Scanner scanner = new Scanner(System.in);
        System.out.print(May_Name);
        name = scanner.next();
        System.out.println(Hello + name);
        //setName(name);
        return "Hello, " + name + "!";
    }
}
