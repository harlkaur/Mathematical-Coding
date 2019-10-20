import java.util.Scanner;

public class nCr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
//			int n = sc.nextInt();
//			int r = sc.nextInt();
//			long num = calculateFact(n);
//			long demo2 = calculateFact(r);
//			if ((n - r) != 0) {
//				long demo1 = calculateFact(n - r);
//				long demo = demo1 * demo2;
//				System.out.println(num / demo);
//			} else
//				System.out.println(num / demo2);
			
			System.out.println(calculateFact(10));
			System.out.println(calculateFact(100));
			System.out.println(calculateFact(50));
			System.out.println(calculateFact(700));
			System.out.println(calculateFact(800));
		}
	}

	private static long calculateFact(int n) {
		long fact = n;
		if (n ==0)
			return 1;
		else
			return fact * calculateFact(n - 1);
		
	}

}
