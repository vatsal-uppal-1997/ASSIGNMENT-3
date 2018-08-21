import java.util.Scanner;

public class Reverse {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		int n = sc.nextInt();
		int reverse=0;
		while (n != 0) {
			reverse = (reverse*10) + (int)(n%10);
			n /= 10;
		}
		System.out.println(reverse);
	}
}