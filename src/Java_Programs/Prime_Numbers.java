package Java_Programs;

public class Prime_Numbers {
	
	/*Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
	In other words, prime numbers can't be divided by other numbers than itself or 1.
	For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.*/

	// Prime Number Program using Method in Java

	/*static void checkPrime(int n) 
	{
		int i, m = 0, flag = 0;
		m = n / 2;
		
		if (n == 0 || n == 1) 
		{
			System.out.println(n + " is not prime number");
		} else 
		{
			for (i = 2; i <= m; i++) 
			{
				if (n % i == 0) 
				{
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is prime number");
			}
		} // end of else
	}

	public static void main(String args[]) {
		checkPrime(1);
		checkPrime(3);
		checkPrime(17);
		checkPrime(20);
	}*/
	

	 static boolean isPrime(int n) 
	    { 
	        // Corner case 
	        if (n <= 1) 
	            return false; 
	       
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	       
	        return true; 
	    } 
	 
	      
	    /* Driver program  */
	    public static void main(String[] args)  
	    { 
	         if(isPrime(3))  
	         System.out.println(" Prime number") ; 
	          
	         else 
	         System.out.println(" Not a Prime number"); 
	           
	    } 
	
	   
}
