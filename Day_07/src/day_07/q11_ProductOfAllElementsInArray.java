package day_07;

public class q11_ProductOfAllElementsInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int prod = 1;

		for (int element : arr) {
			prod = prod * element;
		}
		System.out.println(prod);

	}
}
