package day_02;

public class q02_SquareRoot {
	public static void main(String[] args) {

		int num = 64;
		boolean sqRoot = false;
		int res = 0;
		int root = 0;

		for (int i = 0; i <= num; i++) {
			res = i * i;
			if (res == num) {
				sqRoot = true;
				root = i;
				break;
			}
		}
		if (sqRoot) {
			System.out.println(" Square root of " + num + " is " + root);
		} else {
			System.out.println("Integer as a Square root of " + num + " doesn't exist.");
		}

	}
}
