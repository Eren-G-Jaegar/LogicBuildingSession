package day_01;

public class q01_IsPrime {
	public static void main(String[] args) {

		boolean isPrime = true;
		int num = 29;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}

	}
}
