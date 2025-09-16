package day_03;

public class q02_RootOfQuadraticEquation {

	public static double sqRoot(double num, double guess) {
		double nextGuess = (guess + (num / guess)) / 2;
		if (nextGuess == guess) {
			return nextGuess;
		}

		return sqRoot(num, nextGuess);
	}

	public static void main(String[] args) {

		double a = 2, b = 5, c = 2;
		double root1 = 0, root2 = 0;
		double deter = (b * b) - (4 * a * c);

		if (deter > 0) {
			root1 = (-b + sqRoot(deter, deter / 2)) / (2 * a);
			root2 = (-b - sqRoot(deter, deter / 2)) / (2 * a);
			System.out.println(root1);
			System.out.println(root2);
		} else if (deter == 0) {
			root1 = root2 = (-b) / (2 * a);
			System.out.println(root1);
			System.out.println(root2);
		} else {
			System.out.println("Roots are imaginary.");

		}

	}
}
