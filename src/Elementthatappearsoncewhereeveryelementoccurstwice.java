import java.util.Arrays;
import java.util.Scanner;

public class Elementthatappearsoncewhereeveryelementoccurstwice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			findElement(arr);
		}
	}

	private static void findElement(int[] arr) {
		Arrays.sort(arr);
		int X = 0;
		for (int i = 0; i < arr.length; i ++) {
			X = X^arr[i];
		}
		System.out.println(X);
	}

}
