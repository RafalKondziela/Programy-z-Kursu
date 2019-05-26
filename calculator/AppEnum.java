package calculator;

import java.util.Scanner;

public class AppEnum {

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter an expression of the form 'x (D to +, O to -, M to *, DZ to /) y'");

				int x = scanner.nextInt();
				String operation = scanner.next();
				int y = scanner.nextInt();
				
				Calculate calculate = Signs.valueOf(operation);
				
				calculate.goCalculate(x, y);

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


