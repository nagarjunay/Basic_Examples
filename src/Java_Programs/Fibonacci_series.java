package Java_Programs;

public class Fibonacci_series {
	
	
	/*In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.

	There are two ways to write the fibonacci series program in java:

	Fibonacci Series without using recursion
	Fibonacci Series using recursion*/

	// the fibonacci series program in java without using recursion.
	public static void main(String args[]) {
		 String cloud = "Cloud";
	        String pix = "Pix";
	        String fizzBuzz = "CloudPix";
		
		for (int i = 1; i <= 100; i++) {
		    boolean shouldCloud = i % 3 == 0;
		    boolean shouldPix = i % 7 == 0;
		    if (shouldCloud && shouldPix) { // Checks for numbers that are both multiples of 5 and 3
		        System.out.print(fizzBuzz);
		    } else if (shouldCloud) { // Checks for numbers that are multiples of 3
		        System.out.print(cloud);
		    } else if (shouldPix) { // Checks for numbers that are multiples of 5
		        System.out.print(pix);
		    } else { // Prints numbers that are not multiples of 3 or 5
		        System.out.print(i);
		    }
		    System.out.print(" ");
		    if (i % 25 == 0) { // Control flow allows 25 values printer per line
		        System.out.println();
		        System.out.println();
		    }
		}
		
		
		/*int n1 = 0, n2 = 1, n3, i, count = 10;
		System.out.print(n1 + " " + n2);// printing 0 and 1

		for (i = 2; i < count; ++i)    // loop starts from 2 because 0 and 1 are already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}*/
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
	 } */
	
	
	
	
	

}
