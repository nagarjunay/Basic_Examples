package Java_Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Settttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> dd = new TreeSet<>();
		dd.add("xyz");
		dd.add("abc");
		dd.add("abc");
		dd.add("nag");
		dd.add("zzz");
		dd.add("fdd");
		dd.add("");

		for (String values : dd) {
			System.out.println(values /*+ "===>>" + +values.hashCode()*/);

		}

		/*TreeSet<String> arraylist = new TreeSet<String>(dd);

		System.out.println(arraylist);*/
		/*System.out.println("****************************");
		sys
		System.out.println(arraylist.get(0).hashCode());
		System.out.println(arraylist.get(1).hashCode());
		System.out.println(arraylist.get(2).hashCode());
		System.out.println(arraylist.get(3).hashCode());
		System.out.println(arraylist.get(4).hashCode());
		System.out.println(arraylist.get(5).hashCode());
*/
	}

}
