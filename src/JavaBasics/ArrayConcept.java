package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]= new int[4];
		i[0]=10;
		i[2]=20;
		i[3]=30;
		i[1]=40;
		System.out.println(i[3]);//ArrayIndexOutOfBoundsException: 4
		System.out.println(i.length);//to print size of array
		//To print all values in an arrary using values
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
			}
		System.out.println("**********************");
		
		
		double d[]= new double[2];
		d[0]=12.33;
		d[1]=23.45;
		System.out.println(d[1]);//ArrayIndexOutOfBoundsException: 4
		System.out.println(d.length);//to print size of array
		
		//To print all values in an arrary using values
		for(int j=0; j<d.length; j++) {
			System.out.println(d[j]);
			}
		
		System.out.println("**********************");
		
		char c[]= new char[3];
		c[0]='r';
		c[1]='k';
		c[2]='$';
		System.out.println(c[1]);//ArrayIndexOutOfBoundsException: 4
		System.out.println(c.length);//to print size of array
		
		//To print all values in an arrary using values
		for(int j=0; j<c.length; j++) {
			System.out.println(c[j]);
			}
		
       System.out.println("**********************");
		
		String s[]= new String[3];
		s[0]="Welcome";
		s[1]="to";
		s[2]="Java programming";
		System.out.println(s[0] + s[1] + s[2]);//ArrayIndexOutOfBoundsException: 4
		System.out.println(s.length);//to print size of array
		
		//To print all values in an arrary using values
		for(int j=0; j<s.length; j++) {
			System.out.println(s[j]);
			}
		
	}

}

