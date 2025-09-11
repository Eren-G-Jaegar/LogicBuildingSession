package day_08;

public class q07_IfStringContainsOnlyDigits {
	public static void main(String[] args) {

		String str = "123";
		boolean bool = true;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				bool = true;
			} else {
				bool = false;
				break;
			}
		}
		if (!bool) {
			System.out.println("Given String doesn't contain only numbers.");
		} else {
			System.out.println("Giver string contains only numbers.");
		}

	}
}
