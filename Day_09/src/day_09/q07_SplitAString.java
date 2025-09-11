package day_09;

public class q07_SplitAString {

	int countWords(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		q07_SplitAString obj = new q07_SplitAString();
		String str = "rze xrecrt vybun";
		int index = 0;
		String n = "";
		String[] stA = new String[obj.countWords(str)];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && i != str.length() - 1) {
				n = n + str.charAt(index);
			} else if (i == str.length() - 1) {
				n = n + str.charAt(i);
				stA[index] = n;
				index++;
				n = " ";
			} else {
				stA[index] = n;
				index++;
				n = " ";
			}
		}

		for (int i = 0; i < stA.length; i++) {
			System.out.print(stA[i]);
		}

	}
}
