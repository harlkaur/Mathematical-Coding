
public class DigitsInFactorial {

	public static void main(String[] args) {

		int n = 8468;
		int result = calculateDigits(n);
		System.out.println(result);
	}

	private static int calculateDigits(int n) {
		{
		    if (n < 0) 
		    return 0;
		    
		    // base case 
		    if (n <= 1) 
		    return 1;
		    
		    // else iterate through n and calculate the 
		    // value 
		    double digits = 0; 
		    for (int i=2; i<=n; i++) 
		    digits += Math.log10(i);
		    
		    return (int) (Math.floor(digits) + 1); 

		    }
	}

//	private static int calculateDigits(int n) {
//		double fact = factorial(n);
////		long fact = 7538058755741581312L;
////		System.out.println(fact);
//		return (int) Math.floor(Math.log10(fact) + 1);
//		
//	}
//
//	private static double factorial(int N) {
//		double fact = 1;
//
//		if (N == 1) {
//			return 1;
//		} else {
//			fact = N * factorial(N - 1);
//		}
////		System.out.println(fact);
//		return fact;
//	}
	
	

}
