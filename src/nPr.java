import java.util.Scanner;

public class nPr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			calculateNPR(n, r);
		}
	}

	private static void calculateNPR(int n, int r) {
		int fact = n - r;
		int num = n, demo = (n - r);
		while (n != 1) {
			num = num * (n - 1);
			n--;
		}
		while (fact != 1) {
			demo = demo * (fact - 1);
			fact--;
		}

		System.out.println(num / demo);
	}

}
