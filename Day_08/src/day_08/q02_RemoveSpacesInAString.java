package day_08;

public class q02_RemoveSpacesInAString {
	public static void main(String[] args) {

		String str1 = "Joh n D oe";
//		char[] arr1 = str1.toCharArray();

		char space = ' ';
		String str2 = "";

		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != space) {
				str2 = str2 + str1.charAt(i);
			}
		}

		System.out.println(str2);

	}
}
