import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = in.nextInt();
		int a = num1;

		System.out.print("Enter second number: ");
		int num2 = in.nextInt();
		int b = num2;

		if (num1 == 0 || num2 == 0) { 
			System.out.println("\nInvalid number. Cannot calculate LCM of zero. Try again!"); 
		}

		else {
			while (b != 0) {
					int r = a % b;
					a = b;
					b = r;
			}
			int lcm = (num1*num2)/a;
			System.out.println("\nLeast Common Multiple: " + lcm);
		}
	}
}