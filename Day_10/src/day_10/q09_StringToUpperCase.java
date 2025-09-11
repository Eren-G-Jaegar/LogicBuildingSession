package day_10;

public class q09_StringToUpperCase {

	char upperCase(char ch) {
		char uc = (char) (ch - 32);

		return uc;
	}

	public static void main(String[] args) {

		q09_StringToUpperCase obj = new q09_StringToUpperCase();

		String str = "John Doe";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {
				ch[i] = obj.upperCase(ch[i]);
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}
}
