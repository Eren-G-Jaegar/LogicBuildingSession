package day_01;

public class q10_SumOfFirstNNaturalNumbers {
	public static void main(String[] args) {

		int range = 10;
		int sum = 0;

		for (int i = 0; i <= range; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}
}
