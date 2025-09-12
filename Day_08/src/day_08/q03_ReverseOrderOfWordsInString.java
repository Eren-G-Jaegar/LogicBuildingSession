package day_08;

class Reverse {
	void reverseChar(char[] ch, int start, int end) {

		String rev = "";
		for (int i = start - 1; i >= end; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}
}

public class q03_ReverseOrderOfWordsInString {
	public static void main(String[] args) {
		Reverse obj = new Reverse();

		String str = "This is a sentence";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) { // Printing given Sentence
			System.out.print(ch[i]);
		}

		int start = 0;

		for (int end = 0; end < ch.length; end++) {
			if (ch[end] == ' ') {
				obj.reverseChar(ch, start, end - 1);
				start = end + 1;
			} else if (end == ch.length - 1) {
				obj.reverseChar(ch, start, end);
			}
		}

		for (int i = 0; i < ch.length; i++) { // Printing altered Sentence
			System.out.print(ch[i]);
		}
	}
}
