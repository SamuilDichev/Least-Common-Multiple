import java.util.Scanner;

public class LCM {
	
	public int greatestCommonDivisor(int num1, int num2) {
			while (num2 != 0) {
					int r = num1 % num2;
					num1 = num2;
					num2 = r;
			}
			return num1;
	}

	public int leastCommonMultiple(int num1, int num2) {
		return (Math.abs(num1*num2))/greatestCommonDivisor(num1,num2);
	}
}