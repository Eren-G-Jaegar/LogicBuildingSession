package day_07;

public class q10_MinAndMaxValuesIn2DArray {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 9, 9 } };
		int min = arr[0][0], max = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
				if (max < arr[i][j]) {
					max = arr[i][j];
				}
			}
		}
		System.out.println(min + "  " + max);

	}
}
