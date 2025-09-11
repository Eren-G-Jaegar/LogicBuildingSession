package day_09;

public class q10_CamelCasePatternMatching {
	public static void main(String[] args) {

		String str = "lindSf";
		if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
			boolean isCam = false;
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					isCam = true;
					break;
				}
			}
			if (isCam) {
				System.out.println("Yes.");
			} else {
				System.out.println("no.");
			}
		} else {
			System.out.println("no");
		}

	}
}
