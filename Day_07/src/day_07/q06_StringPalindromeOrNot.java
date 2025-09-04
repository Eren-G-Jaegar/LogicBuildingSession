package day_07;

public class q06_StringPalindromeOrNot {
	public static void main(String[] args) {

		String str = "Madam";
		String rev = "";
		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.println(rev);

		if (str.equals(rev)) {
			System.out.println("It is a Palindrome.");
		} else {
			System.out.println("It is not a Palindrome.");
		}

	}
}
