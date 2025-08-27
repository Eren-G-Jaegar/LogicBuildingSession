package day_04;

public class q03_ReverseDigitsOfNumber {
	public static void main(String[] args) {

		int num = 123;
		int n = num;
		int rem = 0;
		int rev = 0;

		while (num != 0) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("Original Number: " + n);
		System.out.println("Reversed Number :" + rev);

	}
}
