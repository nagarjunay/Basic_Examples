package Java_Programs;

public class Factorial_Number {
	
	//the factorial Program using loop in java.
	 public static void main(String args[]){  
		 int fact=1, number=5;
		 for(int i=1; i<=number;i++) {
			 fact= fact*i;
		 }
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }
	 
	 
	 
	// the factorial program in java using recursion.
	 
	/* class FactorialExample2{  
		 static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
		 public static void main(String args[]){  
		  int i,fact=1;  
		  int number=4;//It is the number to calculate factorial    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  */

}
