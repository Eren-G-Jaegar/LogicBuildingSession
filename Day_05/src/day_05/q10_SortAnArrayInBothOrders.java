// Sort 1st Half of an Array in Ascending order &
//2nd Half of the Array in Descending Order

package day_05;

public class q10_SortAnArrayInBothOrders {
	public static void main(String[] args) {

		int[] arr = { 10, 11, 9, 8, 7, 6, 5, 1, 0, 2, 3, 4 };
		int n = arr.length;

		for (int i = 0; i < (n / 2); i++) {
			for (int j = 0; j < (n / 2) - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = (n / 2) + 1; i < n; i++) {
			for (int j = (n / 2) + 1; j < n - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

// Output becomes Unsatisfactory if ! element is added.