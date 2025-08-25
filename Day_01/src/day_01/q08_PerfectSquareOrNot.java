package day_01;

public class q08_PerfectSquareOrNot {
	public static void main(String[] args) {

		int num = 64;
		int res = 0;
		int root = 0;
		boolean rootExists = false;

		for (int i = 0; i <= num; i++) {
			res = i * i;
			if (res == num) {
				rootExists = true;
				root = i;
				break;
			}
		}
		if (rootExists) {
			System.out.println(num + " is a perfect Square.");
			System.out.println("Root of " + num + " is " + root);
		} else {
			System.out.println(num + " is not a Perfect Square.");
		}

	}
}
