package day_08;

public class q05_Capitalize1stAndLastCharacterOfEachWord {

	char upperCase(char ch) {
		if (ch >= 'a' || ch <= 'z') {
			int num = ch;
			ch = (char) (num - 32);
		}

		return ch;

	}

	public static void main(String[] args) {

		q05_Capitalize1stAndLastCharacterOfEachWord obj = new q05_Capitalize1stAndLastCharacterOfEachWord();

		String str = "hello world world";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (i == 0 || i == ch.length - 1) {
				ch[i] = obj.upperCase(ch[i]);
			} else if (ch[i] == ' ') {
				ch[i - 1] = obj.upperCase(ch[i - 1]);
				ch[i + 1] = obj.upperCase(ch[i + 1]);
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}
}
