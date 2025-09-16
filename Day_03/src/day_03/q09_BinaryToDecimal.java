package day_03;

public class q09_BinaryToDecimal {

	public static int pow(int num, int upto) {
		int power = 1;
		for (int i = 1; i <= upto; i++) {
			power = power * num;
		}
		return power;
	}

	public static void main(String[] args) {

		int bi = 1111;
		int dec = 0;
		int i = 0;

		while (bi != 0) {
			int rem = bi % 10;
			dec = dec + (pow(2, i) * rem);
			bi = bi / 10;
			i++;
		}
		System.out.println(dec);
	}
}
