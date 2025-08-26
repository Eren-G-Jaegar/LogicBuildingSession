package day_02;

public class q08_PowerOfANumber {
	public static void main(String[] args) {

		int base = 3;
		int power = 4;
		int result = 1;
		for (int i = 1; i <= power; i++) {
			result = result * base;
		}
		System.out.println(result);

	}
}
