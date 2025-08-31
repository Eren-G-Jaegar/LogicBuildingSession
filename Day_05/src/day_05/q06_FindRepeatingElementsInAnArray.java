package day_05;

public class q06_FindRepeatingElementsInAnArray {
	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 2, 3, 4, 5, 5, 5 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				continue;
			}

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = 0;
				}
			}
			if (count != 0) {
				System.out.println(arr[i] + " is repeating " + count + " times.");
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
