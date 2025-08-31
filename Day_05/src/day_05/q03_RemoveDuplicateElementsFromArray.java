package day_05;

public class q03_RemoveDuplicateElementsFromArray {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5, 5 };

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				continue;
			}

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
