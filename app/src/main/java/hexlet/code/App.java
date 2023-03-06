package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progress;

//import hexlet.code.Engine;
import java.util.Scanner;

public class App {

    private static final int ENGINE = 1;
    private static final int EVEN = 2;
    private static final int CALC = 3;
    private static final int GCD = 4;
    private static final int PROGRESSION = 5;
    private static final int PRIME = 6;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                +
                "1 - Greet\n"
                +
                "2 - Even\n"
                +
                "3 - Calc\n"
                +
                "4 - GCD\n"
                +
                "5 - Progression\n"
                +
                "6 - Prime\n"
                +
                "0 - Exit");
        System.out.print(Engine.ANSWERS);
        int nameInt = scanner.nextInt();
        switch (nameInt) {
            case ENGINE:
                Engine.hello();
                break;
            case EVEN:
                Even.runEven();
                break;
            case CALC:
                Calc.runCalc();
                break;
            case GCD:
                Gcd.runGcd();
                break;
            case PROGRESSION:
                Progress.runPrg();
                break;
            case PRIME:
                Prime.runPrm();
                break;
            default:
                System.out.println("No number Game");
        }
    }
}

