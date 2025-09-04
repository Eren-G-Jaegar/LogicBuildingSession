package day_07;

import java.util.Arrays;

public class q01_MoveNegativeElementsToOneSide {
	public static void main(String[] args) {

		int[] arr = { 2, -1, 3, -99, -4, 4, 5, -5 };
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
				index++;
			}
		}
		// Printing Elements of Array using FOR EACH
		for (int i : arr) {
			System.out.print(i + " ");
		}

		System.out.println();
		System.out.println(Arrays.toString(arr));

	}
}
