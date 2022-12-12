package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class App {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the game number and press Enter.\n" +
				"1 - Greet\n" +
				"2 - Even\n" +
				"3 - Calc\n" +
				"4 - GCD\n" +
				"5 - Progression\n" +
				"6 - Prime\n" +
				"0 - Exit");
		System.out.print(Engine.Ansver);
		int nameInt = scanner.nextInt();
		if (nameInt == 1) {
				System.out.println(Engine.hello());
		}
		else if (nameInt == 2) {
			System.out.println(Even.even());
		} else if (nameInt == 3) {
				System.out.println(Calc.calc());
		}
		else if (nameInt == 4) {
			System.out.println(Gcd.gcd());
		}
		else if (nameInt == 5) {
			System.out.println(Progress.prg());
		} else if (nameInt == 6) {
			System.out.println(Prime.prm());

		}
	}
	//}

}

