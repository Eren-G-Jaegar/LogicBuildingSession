package day_03;

public class q05_PerfectNumber {
	public static void main(String[] args) {

		int num = 6;
		int sum = 0;

		for (int i = 1; i <= num/2; i++) {
			int rem = num % i;
			while (rem == 0) {
				sum = sum + i;
			}
		}

		if (sum == num) {
			System.out.println(num + " is a Perfect Number.");
		} else {
			System.out.println(num + " is not a Perfect number.");
		}

	}
}
