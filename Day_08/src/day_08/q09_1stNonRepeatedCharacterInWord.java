package day_08;

public class q09_1stNonRepeatedCharacterInWord {
	public static void main(String[] args) {

		String str = "develovpmentdmpntlox";
		char[] ch = str.toCharArray();
		char nonRepetitive = '\0';

		for (int i = 0; i < ch.length; i++) {

			boolean repeated = false;
			char currentChar = ch[i];

			for (int j = 0; j < ch.length; j++) {
				if (i != j && ch[i] == ch[j]) {
					repeated = true;
					break;
				}
			}
			if (!repeated) {
				nonRepetitive = currentChar;
				break;
			}

		}
		if (nonRepetitive != '\0') {
			System.out.println(nonRepetitive);
		}
	}
}
