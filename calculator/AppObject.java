package calculator;

import java.util.Scanner;

public class AppObject {

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter an expression of the form 'x (+,-,*,/) y'");

				int x = scanner.nextInt();
				String operation = scanner.next();
				int y = scanner.nextInt();

				Actions actions = new Actions();
				switch (operation) {

				case "+":
					actions.dodawanie(x, y);
					break;
				case "-":
					actions.odejmowanie(x, y);
					break;
				case "*":
					actions.mnożenie(x, y);
					break;
				case "/":
					actions.dzielenie(x, y);
					break;
				}

				System.out.println("press end if u whant to end or press any key + enter to continiue");
				String check = scanner.next();
				if (check.equals("end"))
					break;
				else
					continue;
			} catch (java.util.InputMismatchException e) {
				System.out.println("Wrong input. Try again ");

			}

		}
	}
}
