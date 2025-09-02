package day_05;

public class q09_SearchElementInArray {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int num = 7;
		boolean isEqual = false;
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == num) {
					isEqual = true;
					index = arr[i][j];
					break;
				}

			}
		}
		if (isEqual) {
			System.out.println(num + " is in index " + index + " in given array.");
		} else {
			System.out.println("Element not found.");
		}
// How to Show both indices as an output???
	}
}
