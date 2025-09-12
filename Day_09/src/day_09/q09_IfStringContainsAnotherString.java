package day_09;

public class q09_IfStringContainsAnotherString {
	public static void main(String[] args) {

		String str = "qwerty";
		String str1 = "qw";
		int index = 0;
		boolean containsChar = false;
		boolean contains = false;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str1.charAt(i) == str.charAt(j)) {
					containsChar = true;
				}
				if (containsChar) {
					index = j + index;
					containsChar = false;
					break;
				}

			}
			if (index == str1.length()) {
				contains = true;
				break;
			}
		}
		if (contains) {
			System.out.println("Yes.");
		} else {
			System.out.println("No.");
		}

	}
}
