package day_05;

public class q04_SortArrayContaining0s1sAnd2s {
	public static void main(String[] args) {

		int[] arr = { 0, 0, 0, 1, 3, 2, 2, 6, 4, 2, 1, 3, 4, 0 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + i];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
