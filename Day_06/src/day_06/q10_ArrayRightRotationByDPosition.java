package day_06;

public class q10_ArrayRightRotationByDPosition {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 5;

		for (int i = 0; i < d; i++) {
			int temp = arr[arr.length - 1];

			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
