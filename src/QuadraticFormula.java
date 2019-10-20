
public class QuadraticFormula {

	public static void main(String[] args) {
		int a = 1, b = 4, c = 8;
		double roots = b * b - 4 * a * c;
		if (roots < 0) {
			System.out.println("Imaginary");
		} else {
			double k = (-b + Math.sqrt(roots)) / (2 * a);
			double k2 = (-b - Math.sqrt(roots)) / (2 * a);
			
			int m1 = (int) Math.floor(k);
			int m2 = (int)Math.floor(k2);
			if(m1>m2) {
				System.out.print(m1 + " " + m2);
			}else {
				System.out.print(m2 + " " + m1);
			}
		}
	}
}
