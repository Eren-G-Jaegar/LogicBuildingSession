package day_10;

public class q02_ShortestDistanceToACharacter {
	public static void main(String[] args) {

		String str = "llo World";
		int left = 0, right = 0;
		char ch = 'l';

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				break;
			}
			left++;
		}
		for (int i = str.length() - 1; i > 0; i--) {
			if (str.charAt(i) == ch) {
				break;
			}
			right++;
		}

		if (left < right) {
			System.out.println("left.");
		} else {
			System.out.println("right.");
		}
	}
}
