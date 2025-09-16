package day_02;

public class q05_Convert0To1 {
	public static void main(String[] args) {

		int num = 12003001;

		int multiplier = 1;
		int result = 0;

		while (num != 0) {
			int digit = num % 10;
			if (digit == 0) {
				digit = 1;
			}
			result = (digit * multiplier) + result;
			multiplier = multiplier * 10;
			num = num / 10;
		}
		System.out.println(result);

	}
}
