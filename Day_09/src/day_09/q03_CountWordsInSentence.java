package day_09;

public class q03_CountWordsInSentence {
	public static void main(String[] args) {

		String str = "hello world world";
		int count = 1;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
