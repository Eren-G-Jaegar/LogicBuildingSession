// Sum of factorials of digits of a Number
// equals the Number

package day_03;

class Factorial {
	int calFact(int num) {
		int fact = 1;

		if (num == 0) {
			return 1;
		}

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}

public class q04_StrongNumber {
	public static void main(String[] args) {

		Factorial obj1 = new Factorial();
//		System.out.println(obj1.calFact(0));

		int num = 40805;
		int n = num;
		int rem = 0;
		int fact = 0;
		int sum = 0;
		boolean isEqual = false;

		for (int i = 0; i <= n; i++) {
			rem = num % 10;
			fact = obj1.calFact(rem);
			sum = sum + fact;
			if (sum == n) {
				isEqual = true;
			}
			num = num / 10;
		}

		if (isEqual) {
			System.out.println(n + " is a Strong number.");
		} else {
			System.out.println(n + " is not a Strong number.");
		}

	}
}
