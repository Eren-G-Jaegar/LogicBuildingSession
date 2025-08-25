package day_01;

public class q03_Palindrome {
	public static void main(String[] args) {

		int num = 123;
		int n = num;
		int rev = 0;

		while (num != 0) {
			int rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}

		if (rev == n) {
			System.out.println(n + " is a Palindrome.");
		} else {
			System.out.println(n + " is not a Palindrome.");
			System.out.println("Revers of " + n + " is " + rev);
		}

	}
}
