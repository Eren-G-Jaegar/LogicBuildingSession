// A number is equal to sum of all digits 
//raised to the power of number of digits in it

package day_01;

public class q04_ArmstrongNumber {
	public static void main(String[] args) {

		int num = 370;
		int n = num;
		int armnum = 0;

		while (num != 0) {
			int rem = num % 10;
			armnum = (rem * rem * rem) + armnum;
			num = num / 10;
		}

		if (n == armnum) {
			System.out.println(n + " is a Armstrong number.");
		} else {
			System.out.println(n + " is not a Armstrong number.");
		}

	}
}
