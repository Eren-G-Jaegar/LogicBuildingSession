package day_01;

public class q07_SumofDigitsofNumber {
	public static void main(String[] args) {
		int num = 999;
		int n = num;
		int sum = 0;

		for (int i = 0; i <= n; i++) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println(sum);
	}
}
