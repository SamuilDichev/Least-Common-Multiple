import java.util.Scanner;

public class LCMUtility {

	public static void main(String[] args) {

		if (args.length == 0) {	
			Scanner in = new Scanner(System.in);

			System.out.print("Enter first number: ");
			int num1 = in.nextInt();

			System.out.print("Enter second number: ");
			int num2 = in.nextInt();
			if (num1 == 0 || num2 == 0) {
				System.out.println ("\nInvalid number. Cannot calculate LCM of zero. Try again!");
			}

			else {
				LCM nok = new LCM();
				int output = nok.leastCommonMultiple(num1, num2);
				System.out.println("\nLeast Common Multiple: " + output);
			}
		}

		else if (args.length == 1) {
			try {
				int num1 = Integer.parseInt(args[0]);

				Scanner in = new Scanner(System.in);
				System.out.print("Enter one more number: ");
				int num2 = in.nextInt();

				if (num1 == 0 || num2 == 0) {
					System.out.println ("\nInvalid number. Cannot calculate LCM of zero. Try again!");
				}

				else {
					LCM nok = new LCM();
					int output = nok.leastCommonMultiple(num1, num2);
					System.out.println("\nLeast Common Multiple: " + output);
				} 
			}

			catch (NumberFormatException e) {
				System.err.println("\nArgument " + '"' + args[0] + '"' + " must be an integer.");
			}
		}

		else if (args.length == 2) {
			try {
				int num1 = Integer.parseInt(args[0]);
				int num2 = Integer.parseInt(args[1]);

				if (num1 == 0 || num2 == 0) {
					System.out.println ("\nInvalid number. Cannot calculate LCM of zero. Try again!");
				}

				else {
					LCM nok = new LCM();
					int output = nok.leastCommonMultiple(num1, num2);
					System.out.println("\nLeast Common Multiple: " + output);
				}
			}

			catch (NumberFormatException e) {
				System.err.println("\nArguments " + '"' + args[0] + '"' + " and " + '"' + args[1] + '"' + " must both be integers.");
			}
		}

		else {
			System.out.println("\nInvalid number of arguments. Will only work with 0, 1 or 2 arguments.");
		}
	}
}