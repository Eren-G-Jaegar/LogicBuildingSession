package day_05;

public class q01_MedianOf2SortedArraysOfEqualSize {
	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double premid1 = arr1[(arr1.length / 2) - 1];
		double mid1 = arr1[arr1.length / 2];
		double res1 = (premid1 + mid1) / 2;

		System.out.println(res1);

	}
}
