package day_07;

public class q04_NearestSmallestNumberOnLeftSideOfArray {
	public static void main(String[] args) {

		int[] arr = { 2, 3, 4, 5, 1, 6, 7, 8, 9, 10 };
		int small = arr[0];
		for (int i = 0; i < arr[arr.length / 2]; i++) {
			if (small > arr[i]) {
				small = arr[i];
			}
		}
		System.out.println(small);
	}
}
