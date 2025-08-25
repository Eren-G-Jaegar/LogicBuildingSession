package day_01;

public class q02_Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int n = num;

		// Start to End
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);

		// End to Start
//		while (num > 0) {
//			fact = fact * num;
//			num--;
//		}
//		System.out.println("Factorial of " + n + " is " + fact);

	}
}
