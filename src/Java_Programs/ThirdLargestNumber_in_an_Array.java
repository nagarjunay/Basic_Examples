package Java_Programs;

public class ThirdLargestNumber_in_an_Array {
	
	/*We can find the third largest number in an array in java by sorting the array and returning the 3nd largest number. 
	Let's see the full example to find the third largest number in java array.
*/
	
	public static int getThirdLargest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[total - 3];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
		System.out.println("Third Largest: " + getThirdLargest(a, 6));
		System.out.println("Third Largest: " + getThirdLargest(b, 7));
	}
}
