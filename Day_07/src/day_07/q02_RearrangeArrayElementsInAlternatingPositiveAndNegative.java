package day_07;

import java.util.ArrayList;

public class q02_RearrangeArrayElementsInAlternatingPositiveAndNegative {
	public static void main(String[] args) {

		int[] arr = { 1, 2, -3, -9, -7, 3, 7, 8, -2, -63 };

//		for (int i = 0; i < arr.length; i ++) {
//			int neg = arr[i];
//			int pos = arr[neg + 1];
//			if (neg < 0 && pos >= 0) {
//				int temp = arr[neg];
//				arr[neg] = arr[pos];
//				arr[pos] = temp;
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}

		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();

		for (int elements : arr) {

			int pi = elements;
			if (arr[elements] >= 0) {
				pos.add(arr[elements]);
				pi = pi + 2;
			}
			int ni = elements;
			if (arr[elements] < 0) {
				neg.add(arr[elements]);
				ni = ni + 2;
			}
			for (int i = 0; i < pos.size(); i++) {
				System.out.print(pos.get(i));
			}

		}

	}
}
