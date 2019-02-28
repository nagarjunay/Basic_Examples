
public class Hello1 {
	
	/*static boolean isPrime(int n) {
		if(n<=1)
		return false;
		for(int i=2; i<n; i++)
			if(n%i==0) {
		return false;}
		return true;
		
	}
	
	public static void main(String args[]) {

		String str="1234";
		
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		
		if(isPrime(11)) 
			System.out.println("Is Prime number");
			else 
				System.out.println("Not a prime number");
		
		
}*/

public static int getLargestOddFibonacciBetween(int lo, int hi) {
    assert lo <= hi;

    int f0 = 0;
    int f1 = 1;
    int res = -1;

    while (f1 <= hi) {
        int val = f0 + f1;
        f0 = f1;
        f1 = val;

        if (val >= lo && val <= hi && isOdd(val))
            res = val;
    }

    return res;
}

private static boolean isOdd(int val) {
    return (val & 1) == 1;
}
	
	/*  public static void main(String[] args) {
	        try {
	            int n1 = 100;
	            int n2 = 250;
	            int res = 0;

	            if (n1 % 2 == 0) {
	                n1 += 1;

	                for (int i = n1; i < n2; i += 2) {
	                    if (isPerfectSquare(5 * i * i + 4) || isPerfectSquare(5 * i * i - 4))
	                        res = i;
	                    System.out.println(res);
	                }
	            }
	        } catch(Exception ignored) {
	            System.out.println("0");
	        }
	    }

	    public static boolean isPerfectSquare(int num) {
	        double sqrt = Math.sqrt(num);
	        int x = (int)sqrt;
	        return Math.pow(sqrt, 2) == Math.pow(x, 2);
	    }
*/
}
