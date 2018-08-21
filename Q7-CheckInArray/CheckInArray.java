import java.util.Scanner;
public class CheckInArray {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		int arrGiven[] = {1,4,6,7,8,9,10};
		int srch[] = new int[arrGiven[arrGiven.length-1]+1];
		int lookFor = sc.nextInt();
		for (int i: arrGiven)
			srch[i]++;
		if (lookFor < arrGiven[arrGiven.length-1] && srch[lookFor] != 0)
			System.out.println("Number is present !");
		else
			System.out.println("Number is not present !");
		// This will work only for sorted arrays though :p
		// Instead of storing a count for each element, indexes can be stored by using a normal for loop
	}
}