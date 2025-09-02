package day_06;

public class q08_SortArrayBasedOnAnotherArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int[] ano = { 5, 4, 3, 2, 1 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < ano.length; j++) {
				if (arr[i] == ano[j]) {
					int temp = ano[i];
					ano[i] = ano[j];
					ano[j] = temp;
				}
			}
		}
		for (int i = 0; i < ano.length; i++) {
			System.out.print(ano[i] + " ");
		}

	}
}
