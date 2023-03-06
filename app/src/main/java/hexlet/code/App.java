package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
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
            case 1:
                Engine.hello();
                break;
            case 2:
                Even.runEven();
                break;
            case 3:
                Calc.runCalc();
                break;
            case 4:
                Gcd.runGcd();
                break;
            case 5:
                Progress.runPrg();
                break;
            case 6:
                Prime.runPrm();
                break;
            default:
                System.out.println("No number Game");
        }
    }
}

