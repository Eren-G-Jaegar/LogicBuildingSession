// Greatest +ve int that divides 
// w/o leaving any rem

package day_01;

public class q06_GCD {
	public static void main(String[] args) {

		int n1 = 36;
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
	}
}
