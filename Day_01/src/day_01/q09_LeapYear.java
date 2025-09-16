package day_01;

public class q09_LeapYear {
	public static void main(String[] args) {

		int y = 2000;

		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0))) {
			System.out.println(y + " is a Leap year.");
		} else {
			System.out.println(y + " is not a Leap year.");
		}

	}
}
