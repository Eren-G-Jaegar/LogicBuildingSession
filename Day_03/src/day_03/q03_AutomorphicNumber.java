// A number whose square ends with the same number 

package day_03;

public class q03_AutomorphicNumber {
	public static void main(String[] args) {

		int num = 25;
		int square = num * num;

		if (square % 100 == num) {
			System.out.println(num + " is an Automorphic number.");
		} else {
			System.out.println(num + " is not an Automorphic number.");
		}

	}
}
