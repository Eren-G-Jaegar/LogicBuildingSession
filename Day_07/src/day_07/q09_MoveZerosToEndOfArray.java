package day_07;

public class q09_MoveZerosToEndOfArray {
	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 2, 3, 4, 5, 0, 4, 0 };
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}

		while (index < arr.length) {
			arr[index++] = 0;
		}

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}
}
