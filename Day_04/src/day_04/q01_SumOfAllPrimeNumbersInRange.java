package day_04;

public class q01_SumOfAllPrimeNumbersInRange {
	public static void main(String[] args) {

		int range = 5;
		int sum = 0;
		int prime = 0;
		int rem = 0;
		boolean isPrime = false;

		for (int i = 2; i <= range; i++) {
			for (int j = 2; j <= i; j++) {
				rem = i % j;

				if (rem != 0) {
					prime = i;
					sum = sum + prime;
					System.out.println(sum);
				}
			}
		}

	}
}
