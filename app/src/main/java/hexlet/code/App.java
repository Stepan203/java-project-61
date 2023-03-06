package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progress;

//import hexlet.code.Engine;
import java.util.Scanner;

public class App {

    private static final int engineGame = 1;
    private static final int evenGame = 2;
    private static final int calcGames = 3;
    private static final int gcdGame = 4;
    private static final int progressionGame = 5;
    private static final int primeGame = 6;
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
        System.out.print(Engine.answers);
        int nameInt = scanner.nextInt();
        switch (nameInt) {
            case engineGame:
                Engine.hello();
                break;
            case evenGame:
                Even.runEven();
                break;
            case calcGames:
                Calc.runCalc();
                break;
            case gcdGame:
                Gcd.runGcd();
                break;
            case progressionGame:
                Progress.runPrg();
                break;
            case primeGame:
                Prime.runPrm();
                break;
            default:
                System.out.println("No number Game");
        }
    }
}

