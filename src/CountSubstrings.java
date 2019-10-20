import java.util.Scanner;

public class CountSubstrings {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String str = sc.next();
			int result = countSubstrings(str);
			System.out.println(result);
		}

	}

	private static int countSubstrings(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '1') {
				count++;
			}
		}
		return (count * (count - 1)) / 2;
	}

}
