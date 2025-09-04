package day_07;

public class q03_Convert2DArrayTo1DArary {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[] newArr = new int[arr.length * arr[1].length];

//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr.length; j++) {
//				int index = 0;
//				newArr[index++] = arr[i][j];
//			}
//		}
//

		int index = 0;
		for (int[] row : arr) {
			for (int element : row) {
				newArr[index++] = element;
			}

		}

		for (int i : newArr) {
			System.out.print(i + " ");
		}

	}
}
