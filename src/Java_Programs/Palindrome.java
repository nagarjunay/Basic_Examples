package Java_Programs;

public class Palindrome {
	
	/*Palindrome number in java: A palindrome number is a number that is same after reverse. 
	For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
	It can also be a string like LOL, MADAM etc.*/
	
	public static void main(String args[]) {
		int r, sum = 0, temp;
		int n = 454;    // It is the number variable to be checked for palindrome

		temp = n;
		while (n > 0) {
			r = n % 10;     // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum)
			System.out.println("palindrome number ");
		else
			System.out.println("not palindrome");
	} 
	
	
	/*You can also use a method where number or string is not predefined. 
	Here, user has to put the number or string as input to check if the number/string is palindrome.*/
	
	
	public static void main(String args[]) {
		String original, reverse = ""; // Objects of String class
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string/number to check if it is a palindrome");
		original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome.");
		else
			System.out.println("Entered string/number isn't a palindrome.");
	}

}
