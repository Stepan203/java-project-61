package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Engine {

    //public static String name;
    private String name;
    public String getName()
    {
        return name;
    }

    public void setName(String newName)
    {
        this.name = newName;
    }
    //private String name;
    public static String hello() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        return "Hello, " + name + "!";
    }
}
