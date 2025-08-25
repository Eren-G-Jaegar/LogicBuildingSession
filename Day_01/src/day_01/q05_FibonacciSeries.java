package day_01;

public class q05_FibonacciSeries {
	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int times = 10;

		if (times > 1) {
			System.out.println(n1);
		}
		if (times >= 2) {
			System.out.println(n2);
		}

		for (int i = 3; i <= times; i++) {
			int nextnum = n1 + n2;
			System.out.println(nextnum);
			n1 = n2;
			n2 = nextnum;
		}
	}
}
