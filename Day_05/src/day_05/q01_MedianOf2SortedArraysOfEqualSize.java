package day_05;

public class q01_MedianOf2SortedArraysOfEqualSize {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] arr2 = { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int[] newArr = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			newArr[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			newArr[arr1.length + i] = arr2[i];
		}
//		for (int i = 0; i < newArr.length; i++) {
//			System.out.print(newArr[i] + " ");
//		}
		double premid1 = newArr[(newArr.length / 2) - 1];
		double mid1 = newArr[newArr.length / 2];
		double res1 = (premid1 + mid1) / 2;

		System.out.println(res1);

	}
}
