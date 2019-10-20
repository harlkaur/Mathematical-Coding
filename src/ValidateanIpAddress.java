import java.util.Scanner;

public class ValidateanIpAddress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String ip = sc.next();
			if (isValid(ip))
				System.out.println("1");
			else
				System.out.println("0");
		}

	}

	private static boolean isValid(String s) {
		String regex = "[0-255]+";
		if (s.length() > 15 || s.length() <= 0 || s.endsWith("."))
			return false;
		else {
			String[] str = s.split("\\.");
			if (str.length == 0 || str.length != 4)
				return false;
			for (String ss : str) {
				if (!ss.matches(regex))
					return false;
				if (!((Long.parseLong(ss) >= 0 && Long.parseLong(ss) <= 255))) {
					return false;
				}
				if (ss.length() > 1 && ss.startsWith("0") ) {
					return false;
				}
			}
		}
		return true;
	}

}
