package calculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter an expression of the form 'x (+,-,*,/) y'");

				int x = scanner.nextInt();
				String operation = scanner.next();
				int y = scanner.nextInt();

				switch (operation) {
				case "+":
					System.out.println("Your answer is " + (x + y));
					break;

				case "-":
					System.out.println("Your answer is " + (x - y));
					break;

				case "/":
					System.out.println("Your answer is " + (x / y));
					break;

				case "*":
					System.out.println("Your asnwer is " + (x * y));
					break;

				default:
					System.out.println("Wrong input");

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
