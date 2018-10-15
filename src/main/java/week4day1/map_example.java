package week4day1;

import java.util.HashMap;
import java.util.Map;

public class map_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="will i succeed in interview";
		char[] charArray = input.toCharArray();
		HashMap<Character, Integer> hashMap = new HashMap<>();
		for (char c : charArray) {
			if(hashMap.containsKey(c)) 
				hashMap.put(c,hashMap.get(c)+1);
			else
				hashMap.put(c,1);
		}
		System.out.println(hashMap);

		
	}

}
