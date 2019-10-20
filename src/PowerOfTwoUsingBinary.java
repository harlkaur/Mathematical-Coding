import java.util.Scanner;

public class PowerOfTwoUsingBinary {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			long no = sc.nextLong();
			boolean result = powerOfTwo(no);
			if (result)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

	private static boolean powerOfTwo(long no) {
		return no != 0 && (no & (no - 1)) == 0;
	}

}
