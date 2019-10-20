import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			int students = sc.nextInt();
			chocolateDistProblem(arr, students);
		}
	}

	private static void chocolateDistProblem(int[] arr, int students) {
		Arrays.sort(arr);
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if ((students + i-1 < arr.length) && (diff > (arr[students + i - 1] - arr[i])))
				diff = arr[students + i - 1] - arr[i];
		}
		System.out.println(diff);
	}

}
