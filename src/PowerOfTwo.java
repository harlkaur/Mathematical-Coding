import java.util.Scanner;

public class PowerOfTwo {

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
		boolean flag = true;
		if (no == 1) {
			return flag = true;
		}
		if (no == 0) {
			return flag = false;
		}
		while (no > 2) {
			if (no % 2 == 0) {
				no = no / 2;
			} else {
				return flag = false;
			}
		}
		return flag;
	}

}
