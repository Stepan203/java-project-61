package hexlet.code;

//import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the game number and press Enter.\n" +
				"1 - Greet\n" +
				"2 - Even\n" +
				"3 - Calc\n" +
				"0 - Exit");
		System.out.print("Your choice: ");
		int nameInt = scanner.nextInt();
		if (nameInt == 1) {
				System.out.println(Engine.hello());
		}
		else if (nameInt == 2) {
			System.out.println(Even.even());
		} else if (nameInt == 3) {
				System.out.println(Class.class);
		}
		}
	//}

}

