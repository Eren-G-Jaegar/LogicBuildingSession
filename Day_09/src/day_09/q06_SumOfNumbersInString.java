package day_09;

public class q06_SumOfNumbersInString {

	public static int number(char ch) {
		int num = (int) ch - 48;

		return num;
	}

	public static void main(String[] args) {

		String str = "0505";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum = sum + number(str.charAt(i));
			}
		}
		System.out.println(sum);
	}
}
