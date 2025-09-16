package day_03;

public class q07_Tables {
	public static void main(String[] args) {

		int num = 7;
		int table = 0;

		for (int i = 1; i <= 10; i++) {
			table = num * i;
			System.out.println(num + " * " + i + " = " + table);
		}
	}
}
