// Smallest common number appearing in
// tables of given numbers

package day_02;

public class q01_LCM {
	public static void main(String[] args) {

		int n1 = 18;
		int n2 = 36;
		int res = n1 - n2;
		int gn, sn, gcd = 0;
		if (res < 0) {
			gn = n2;
			sn = n1;
		} else {
			gn = n1;
			sn = n2;
		}

		for (int i = 1; i <= sn && i <= gn; i++) {
			if (sn % i == 0 && gn % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd + " is GCD of " + n1 + " & " + n2);

		int lcm = (n1 * n2) / gcd;
		System.out.println("LCM of " + n1 + " & " + n2 + " is " + lcm);

	}
}
