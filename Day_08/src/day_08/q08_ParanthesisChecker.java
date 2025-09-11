package day_08;

public class q08_ParanthesisChecker {
	public static void main(String[] args) {

		String str = "sdlingi";
		char[] ch = str.toCharArray();
		boolean exists = false;

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '}') {
				exists = true;
			}
		}
		if (exists) {
			System.out.println("Given String contains Paranthesis.");
		} else {
			System.out.println("Given String doesn't contain Paranthesis.");
		}

	}
}
