package day_08;

public class q01_StringContainsAnotherString {
	public static void main(String[] args) {

		String str = "hellohello";
		String substr = "ello";
		int count = 0;

		for (int i = 0; i <= str.length() - substr.length(); i++) {
			boolean isMatch = true;
			for (int j = 0; j < substr.length(); j++) {
				if (str.charAt(i + j) != substr.charAt(j)) {
					isMatch = false;
					break;
				}
			}
			if (isMatch) {
				count++;
			
			}
		}
		System.out.println(count);
	}
}
