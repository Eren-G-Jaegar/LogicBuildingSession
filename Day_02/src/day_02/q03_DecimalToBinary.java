package day_02;

public class q03_DecimalToBinary {
	public static void main(String[] args) {

		int num = 15;
		int rem = 0;
		String bi = "";

		while (num > 0) {
			rem = num % 2;
			bi = rem + bi;
			num = num / 2;
		}
		System.out.println(bi);
	}
}
