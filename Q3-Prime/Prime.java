import java.util.Scanner;
public class Prime {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		for (int i=2;i<=n;i++) {
			if (arr[i] == 0) {
				System.out.println(i);
				for (int j=i;j<n;j+=i)
					arr[j] = 1;
			}
		}
	}
}