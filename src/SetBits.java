import java.util.Scanner;

public class SetBits {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t-- != 0) {
			long no = sc.nextLong();
			long count = setBits(no);
			System.out.println(count);
		}
	}

	private static long setBits(long no) {
		long count = 0;
		while (no != 0) {
			if (no % 2 == 1) {
				++count;
			}
			no = no / 2;
		}
		return count;
	}

}
