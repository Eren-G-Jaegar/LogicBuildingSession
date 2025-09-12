package day_09;

public class q08_ReplaceSpecificCharacterFromString {
	public static void main(String[] args) {

		String str = "aab";
		char[] ch = str.toCharArray();
		char toReplace = 'a';
		char replaceWith = 'z';

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == toReplace) {
				ch[i] = replaceWith;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
}
