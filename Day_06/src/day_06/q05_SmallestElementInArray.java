package day_06;

public class q05_SmallestElementInArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);

	}
}
