package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Even {
    public static String even() {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int min = 10;
        int max = 100;
        var i = 0;
        Engine.hello();
       // Engine names = new Engine();
        //System.out.println(Engine.main());
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (i < Engine.Col_round) {
            int rnd = r.nextInt(max-min) + min;
            System.out.println(Engine.Question + rnd);
            String otd = scanner.next();
            if ((rnd % 2 == 0 & otd.equals("yes")) || (rnd % 2 != 0 & otd.equals("no"))) {
                System.out.println(Engine.Yes);
                i += 1;
            } else {
                return "'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + Engine.name;
            }
        }
        return Engine.Cong + Engine.name + "!";
    }
}
