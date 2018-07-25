package Java_Programs;

public class RemoveDuplicateInArray {
	
	/*We can remove duplicate element in an array by 2 ways: using temporary array or using separate index. 
	To remove the duplicate element from array, the array must be in sorted order. 
	If array is not sorted, you can sort it by calling Arrays.sort(arr) method.*/

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int j = 0;// for next element
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];
		return j;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 30, 30, 40, 50, 50 };
		int length = arr.length;
		length = removeDuplicateElements(arr, length);
		// printing array elements
		for (int i = 0; i < length; i++)
			System.out.print(arr[i] + " ");
	}
	
}
