import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			String no = sc.next();
			convertBinaryToDecimal(no);
		}
	}

	private static void convertBinaryToDecimal(String no) {
		int k = 0;
		double sum = 0;
		for (int i = no.length() - 1; i >= 0; i--) {
			if (no.charAt(i) == '1') {
				sum = sum + Math.pow(2, k);
			}
			k++;
		}
		System.out.println(Math.round(sum));
	}

}
