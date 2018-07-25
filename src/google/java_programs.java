package google;

public class java_programs {

	// the fibonacci series program in java without using recursion.
	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)    // loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
	
	
	/*the fibonacci series program in java using recursion.
	 
	static int n1=0,n2=1,n3=0;    
	 static void printFibonacci(int count){    
	    if(count>0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         printFibonacci(count-1);    
	     }    
	 }    
	 public static void main(String args[]){    
	  int count=10;    
	  System.out.print(n1+" "+n2);   //printing 0 and 1    
	  printFibonacci(count-2);      //n-2 because 2 numbers are already printed   
	 }  
	
	
	
	
	/*Prime Number Program using Method in Java

	public class Prime {
		static void checkPrime(int n) {
			int i, m = 0, flag = 0;
			m = n / 2;
			if (n == 0 || n == 1) {
				System.out.println(n + " is not prime number");
			} else {
				for (i = 2; i <= m; i++) {
					if (n % i == 0) {
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
		}
	}*/
	

}
