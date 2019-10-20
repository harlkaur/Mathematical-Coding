
public class Exactly3Divisors {

	public static void main(String[] args) {

		int N = 30;
		System.out.println(exactly3Divisors(N));
	}

	private static boolean primeNumber(int no) {
		boolean flag=true;
		for(int i=2;i<=no/2;i++) {
			if(no %i==0) {
				flag=false;
				break;
			}
		}
		return flag;
	}
	private static int exactly3Divisors(int n) {

		int i = 2, count = 0;
		for(;i*i<=n;) {
			if(primeNumber(i)) {
				++count;
			}
			
			i = i  + 1;
		}
		
		return count;
	}

}
