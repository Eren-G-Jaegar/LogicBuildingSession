package day_10;

public class q07_RemoveCharacterFromString {
	public static void main(String[] args) {

		String str = "John doe";
		char[] ch = str.toCharArray();
		char a = ' ';

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == a) {
				ch[i] = 0;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}

	}
}
