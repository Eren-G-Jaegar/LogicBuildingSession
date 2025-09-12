 package day_10;

public class q01_LengthOfLastWord {
	public static void main(String[] args) {

		String str = "hello you";
		int count = 0;
		for (int i = str.length() - 1; i <= ' '; i--) {

			if (str.charAt(i) == ' ') {
				break;
			} 
			count++;
		}
		System.out.println(count);

	}
}
