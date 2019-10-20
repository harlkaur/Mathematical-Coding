import java.util.Scanner;

public class nPrUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int r = sc.nextInt();
			long num = calculateFact(n);
			if ((n - r) != 0) {
				long demo = calculateFact(n - r);
				System.out.println(num / demo);
			}else
				System.out.println(num);
		}
	}

	private static long calculateFact(int n) {
		int fact = n;
		if (n > 0) {
			if (n == 1)
				return fact = 1;
			else {
				return fact * calculateFact(n - 1);
			}
		} else
			return -1;
	}
}
