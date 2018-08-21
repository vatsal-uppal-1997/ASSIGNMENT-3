import java.util.Scanner;

public class Armstrong {
	private static Scanner sc = new Scanner(System.in);
	private static int isArmstrong(int n, int len) {
		if (n == 0)
			return 0;
		return (int)Math.pow(n%10,len) + isArmstrong(n/10,len);
	}
	public static void main (String args[]) {
		int n = sc.nextInt();
		if (isArmstrong(n,Integer.toString(n).length()) == n)
			System.out.println("Is Armstrong");
		else
			System.out.println("Is not Armstrong");
	}
}