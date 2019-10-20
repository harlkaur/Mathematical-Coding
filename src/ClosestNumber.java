import java.util.Scanner;

public class ClosestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			closestNumber(N, M);
		}
	}

	private static void closestNumber(int N, int M) {
		boolean negative = (N < 0 || M < 0) ? true : false;
		int rem = N % M;
		if (rem == 0)
			System.out.println(N);
		else {
			int A = (N / M) * M;
			int B = negative ? ((N / M) - 1) * M : ((N / M) + 1) * M;
			if (Math.abs(A - N) < Math.abs(B - N))
				System.out.println(A);
			else
				System.out.println(B);
		}

	}

}
