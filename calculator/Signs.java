package calculator;

public enum Signs implements Calculate {

	D, O, M, DZ;
	
	String znak;

	@Override
	public void goCalculate(int x, int y) {
		switch (this) {
		case D:
			System.out.println("Your answer is " + (x + y));
			break;

		case O:
			System.out.println("Your answer is " + (x - y));
			break;

		case DZ:
			System.out.println("Your answer is " + (x / y));
			break;

		case M:
			System.out.println("Your asnwer is " + (x * y));
			break;

		default:
			System.out.println("Wrong input");

		}
		
	}

}



	