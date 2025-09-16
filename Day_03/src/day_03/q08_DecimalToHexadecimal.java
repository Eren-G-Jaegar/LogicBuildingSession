package day_03;

public class q08_DecimalToHexadecimal {

	public static void main(String[] args) {
		int dec = 1080;
		char[] hexNum = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String res = "";

		while (dec > 0) {
			int remainder = dec % 16;
			res = hexNum[remainder] + res;
			dec = dec / 16;
		}
		System.out.println(res);
	}
}