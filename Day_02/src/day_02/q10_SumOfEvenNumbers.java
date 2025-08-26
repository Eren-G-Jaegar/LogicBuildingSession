package day_02;

public class q10_SumOfEvenNumbers {
	public static void main(String[] args) {

		int range = 5;
		int sum = 0;
		int even = 0;

		for (int i = 0; i <= range; i++) {
			even = i % 2;
			if (even == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);

	}
}
