package day_09;

public class q01_Equalityof2Strings {
	public static void main(String[] args) {

		String str1 = "ABCD";
		String str2 = "ABCD";
		boolean equal = true;

		if (str1.length() != str2.length()) {
			System.out.println("Both Strings are Unequal.");
		} else {
			for (int i = 0; i < str1.length(); i++) {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(i);

				if (ch1 != ch2) {
					equal = false;
					break;
				}
			}
			if (equal) {
				System.out.println("Both Strings are equal.");
			} else {
				System.out.println("Both Strings are Unequal.");
			}
		}
	}
}
