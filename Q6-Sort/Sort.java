public class Sort {
	public static void main(String [] args) {
		int arr[] = {1,1,1,1,0,0,1,0}, i=0, j=0, temp=0;
		for (i=1;i<arr.length;i++) {
			j = i;
			while ( j > 0 && arr[j] < arr[j-1]) {
				temp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = temp;
				j--;
			}
		}
		for (int k:arr)
			System.out.print(k+" ");
	}
}