package Java_Programs;

public class Linear_Search {

	
	/*Linear search is used to search a key element from multiple elements. 
	Linear search is less used today because it is slower than binary search and hashing.
	Algorithm:
	Step 1: Traverse the array
	Step 2: Match the key element with array element
	Step 3: If key element is found, return the index position of the array element
	Step 4: If key element is not found, return -1*/
	
	
	public static int linearSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 50;
		System.out.println(key + " is found at index: " + linearSearch(a1, key));
	}
}
