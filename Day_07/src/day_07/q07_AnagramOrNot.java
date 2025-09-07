package day_07;

public class q07_AnagramOrNot {
	public static void main(String[] args) {

		String str1 = "Anish";
		String str2 = "nisha";

		char[] strArr1 = str1.toCharArray();
		char[] strArr2 = str2.toCharArray();
		int count = strArr1.length;

		if (strArr1.length == strArr2.length) {
			for (int i = 0; i < strArr1.length; i++) {
				for (int j = 0; j < strArr2.length; j++) {
					if (strArr1[i] == strArr2[j]) {
						count = count - 1;
					}
				}
			}
		} else {
			System.out.println("Not Anagrams");
		}
		if (count == 0) {
			System.out.println(str1 + " & " + str2 + " are Anagrams.");
		} else {
			System.out.println(str1 + " & " + str2 + " are not Anagrams.");
		}
	}
}
