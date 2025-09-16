package day_10;

public class q05_ConvertByteArrayToString {

	public static char convert(int num) {
		char ch = (char) num;
		return ch;
	}

	public static void main(String[] args) {

		Byte[] by = { 105, 110, 65, 97 };
		String s = "";

		for (int i = 0; i < by.length; i++) {
			s = s + convert(by[i]);
		}
		System.out.println(s);

	}
}
