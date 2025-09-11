package day_10;

public class q03_CharacterIsVowelOrConsonant {
	public static void main(String[] args) {

		char ch = 'h';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Character is Vowel.");
		} else {
			System.out.println("Character is a Consonant.");
		}

	}
}
