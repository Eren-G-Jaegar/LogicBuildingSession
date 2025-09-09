package day_08;

public class q04_RepetitiveCharactersInString {
	public static void main(String[] args) {

//		String str = "programming";
//		char ch = str.charAt(0);
//		for (int i = str.charAt(ch) + 1; i < str.length() ; i++) {
//			if (str.charAt(i) == ch) {
//				System.out.println(str.charAt(i));
//				ch = str.charAt(i + 1);
//			}
//		}

		String str = "development";
		char[] ch = str.toCharArray();
		boolean[] visited = new boolean[ch.length];

		for (int i = 0; i < ch.length; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					visited[j] = true;
				}
			}
			if (count > 0) {
				System.out.println(ch[i] + " ");
			}
		}

	}
}
