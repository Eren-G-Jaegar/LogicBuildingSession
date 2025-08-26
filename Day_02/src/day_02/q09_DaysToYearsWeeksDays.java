package day_02;

public class q09_DaysToYearsWeeksDays {
	public static void main(String[] args) {

		int totalDays = 375;
		int years = 0;
		int weeks = 0;
		int days = 0;
		int rem;

		years = totalDays / 365;
		System.out.println(years);

		rem = totalDays % 365;

		weeks = rem / 7;
		System.out.println(weeks);

		rem = rem % 7;

		days = rem;
		System.out.println(days);

	}
}
