import java.util.Scanner;
public class Even {
	private static Scanner sc = new Scanner(System.in);
	public static void main (String args[]) {
		int n = sc.nextInt();
		for (int i=2;i<n;i+=2) {
			System.out.println(i);
		}
	}
}