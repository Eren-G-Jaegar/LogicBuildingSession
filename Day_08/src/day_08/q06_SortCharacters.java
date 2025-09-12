package day_08;

public class q06_SortCharacters {
	public static void main(String[] args) {

		String str = "mnbvcxzasdfghjklpoiuytrewq";
		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = 0; j < ch.length - 1; j++) {
				if (ch[j] > ch[j + 1]) {
					char temp = ch[j];
					ch[j] = ch[j + 1];
					ch[j + 1] = temp;
				}
			}
		}

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}

	}
}
