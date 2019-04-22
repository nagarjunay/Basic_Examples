package JavaBasics;

/**
 * Hello world!
 *
 */
public class Prime_number 
{
    public static void main( String[] args )
    {
    int num=23;
    boolean isPrime= true;
    
    for(int i=2; i<num; i++) {
    	if(num%i==0) {
    		isPrime =false;
    		break;
    		
    	}
    		
    } 
    if(isPrime)
    	System.out.println(num +" Is prime number");
    else
    	System.out.println(num +" Not a prime number");
    
    }
}
