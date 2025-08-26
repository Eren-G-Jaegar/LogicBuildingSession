// This program works only upto 63 decimal number
// As soon as a decimal number greater than 63 is passed
// Conversion fails


package day_03;

public class q01_DecimalToOctal {
	public static void main(String[] args) {

		int num = 63;
		String octal = "";

		for (int i = 0; i <= num; i++) {
			int rem = num % 8;
			octal = rem + octal;
			num = num / 8;
		}

		System.out.println(octal);

	}
}
