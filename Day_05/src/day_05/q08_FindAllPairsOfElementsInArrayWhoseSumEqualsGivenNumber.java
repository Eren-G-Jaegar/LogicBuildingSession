package day_05;

public class q08_FindAllPairsOfElementsInArrayWhoseSumEqualsGivenNumber {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int num = 4;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				sum = arr[j] + arr[j + 1];

				if (sum == num) {
					System.out.println(arr[j] + " & " + arr[j + 1] + " = " + num);
				}

			}
		}

	}
}
