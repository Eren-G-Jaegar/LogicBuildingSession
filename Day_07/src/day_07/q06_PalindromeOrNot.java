//It is showing Opposite of Estimated output

package day_07;

public class q06_PalindromeOrNot {
	public static void main(String[] args) {

		String str = "madam";
		String rev = "";
		boolean isPalin = false;

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != rev.charAt(i)) {
				isPalin = false;
				break;
			}
		}
		if (isPalin) {
			System.out.println("It is Palindrome.");
			System.out.println(str + "   " + rev);
		} else {
			System.out.println(str + "   " + rev);
			System.out.println("It is not Palindrome.");
		}
	}
}
