package day_05;

public class q02_LargestSumOfElementsFrom2Arrays {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum1 = 0, sum2 = 0;

		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}

		if (sum1 > sum2) {
			System.out.println("1st Array has largest sum of elements.");
		} else if (sum2 > sum1) {
			System.out.println("2nd Array has largest sum of elements.");
		} else if (sum1 == sum2) {
			System.out.println("Both Arrays have same sum of elements.");
		}

	}
}
