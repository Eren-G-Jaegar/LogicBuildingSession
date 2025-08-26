package day_02;

public class q07_Swap2Numbers {
	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 2;

		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

		System.out.println(n1);
		System.out.println(n2);

	}
}
