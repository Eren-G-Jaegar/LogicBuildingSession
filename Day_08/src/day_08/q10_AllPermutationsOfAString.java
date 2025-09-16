package day_08;

public class q10_AllPermutationsOfAString {
	public static void main(String[] args) {

		String str = "abc";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				char temp = ch[j];
				ch[j] = ch[j + 1];
				ch[j + 1] = temp;
				System.out.println(ch);
			}
		}

	}
}
