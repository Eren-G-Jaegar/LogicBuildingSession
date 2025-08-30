package day_03;

public class q09_BinaryToDecimal {
	public static void main(String[] args) {

		int bi = 0010;
		int decNum = 0;
		int power = 1;

		while (bi != 0) {
			int lastDig = bi % 10;
			decNum = (decNum + lastDig) * power;
			power = power * 2;
			bi = bi / 10;
		}
		System.out.println(decNum);
	}
}
