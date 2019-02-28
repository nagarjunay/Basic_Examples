 package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {
	
	public static void main(String[] args) {
	
	/*1. It contain duplicate value/element 
	  2. Maintains insertion order
	  3. It is not synchronized(Not thread safe in multi-threading)
	  4. It allows random access to fetch the element because it stores the 
	  value on the basis of indexes 	
	  5. */
		
	ArrayList ar= new ArrayList();

	ar.add(10);//0
	ar.add(20);//1
	ar.add(30);//2
	ar.add(40);//3
	System.out.println(ar.size());//size of the array
	System.out.println(ar.get(3));//It get values from index
	
	//To print all the values from arraylist: 
	//1. for loop
	//2. Iterator
	
	for(int i=0; i<=3; i++) {
		System.out.println(ar.get(i));
	}
	
	//Non generic v/s generic 
	
	
	
	
	
	}
	
}
