package day_09;

public class q09_IfStringContainsAnotherString {
	public static void main(String[] args) {

		String str = "abcdefg";
		String str1 = "bc";
		int n = 0;
		int index = 0;
		boolean containsChar = false;
		boolean contains = false;

		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (str1.charAt(i) == str.charAt(j)) {
					containsChar = true;
				}
				if (containsChar) {
					index = index + 1;
					containsChar = false;
					n = n + 1;
				}
				if (n == str1.length()) {
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
