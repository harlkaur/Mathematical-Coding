import java.util.Scanner;

public class NearestMultipleOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String num = sc.next();
			printNumber(num);
			System.out.println();
		}
	}

	private static void printNumber(String num) {
		char[] ch = num.toCharArray();
		int length = ch.length;
		int carry = 0;
		if (ch[length - 1] <= '5') {
			ch[length - 1] = '0';
		} else {
			ch[length - 1] = '0';
			carry = 1;
			for (int i = length - 2; i >= 0; i--) {
				int k = (ch[i] - '0' + carry);
				carry = k / 10;
				k = k % 10;
				ch[i] = (char) ((char) k + '0');
			}

		}
		if (carry > 0)
			System.out.print(carry);
		for (int i = 0; i < length; i++) {
			System.out.print(ch[i]);
		}
	}

}
