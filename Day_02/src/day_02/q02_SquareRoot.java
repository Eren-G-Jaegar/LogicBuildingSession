package day_02;

public class q02_SquareRoot {

	public static double sqRoot(double num, double guess) {
		double nextGuess = (guess + (num / guess)) / 2;
		if (nextGuess == guess) {
			return nextGuess;
		}
		return sqRoot(num, nextGuess);
	}

	public static void main(String[] args) {

		System.out.println(sqRoot(25, 25 / 2));

	}
}
