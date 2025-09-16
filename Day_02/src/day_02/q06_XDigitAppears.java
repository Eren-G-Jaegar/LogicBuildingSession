package day_02;

public class q06_XDigitAppears {
	public static void main(String[] args) {

		int num = 222202222;
		int n = num;
		int x = 2;
		int count = 0;
		

		for (int i = 0; i <= n; i++) {
			int rem = num % 10;
			if (rem == x) {
				count++;

			}
			num = num / 10;
		}
		System.out.println(count);
	}
}
