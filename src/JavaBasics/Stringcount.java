package JavaBasics;

import java.util.HashMap;
import java.util.Map;

public class Stringcount {
	
	public static void main(String[] args)
	{
		
		String str = "aa dcbbd daa vdfgds faerssss";

		Map<Character, Integer> charcount = new HashMap<Character, Integer>();

		for (Character c : str.toCharArray()) 
		{
			if (charcount.containsKey(c)) 
			{
				charcount.put(c, charcount.get(c) + 1);
			} else 
			{
				charcount.put(c, 1);

			}
		}

		System.out.println(charcount);

	}
	

}
