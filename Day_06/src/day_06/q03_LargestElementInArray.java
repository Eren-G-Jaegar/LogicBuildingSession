package day_06;

public class q03_LargestElementInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int largest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				largest = arr[i];
			}
		}
		System.out.println(largest);

	}
}
