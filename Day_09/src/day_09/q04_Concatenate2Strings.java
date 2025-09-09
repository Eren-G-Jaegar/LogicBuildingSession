package day_09;

public class q04_Concatenate2Strings {
	public static void main(String[] args) {

		String str1 = "John ";
		String str2 = "Doe";

		char[] ch1 = new char[str1.length()];
		char[] ch2 = new char[str2.length()];

		char[] newStr = new char[ch1.length + ch2.length];

		for (int i = 0; i < ch1.length; i++) {
			ch1[i] = str1.charAt(i);
		}
		for (int i = 0; i < str2.length(); i++) {
			ch2[i] = str2.charAt(i);
		}

		for (int i = 0; i < ch1.length; i++) {
			newStr[i] = ch1[i];
		}
		for (int i = 0; i < ch2.length; i++) {
			newStr[ch1.length + i] = ch2[i];
		}

		for (int i = 0; i < newStr.length; i++) {
			System.out.print(newStr[i]);
		}

	}
}
