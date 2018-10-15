package week4day1;

import java.util.HashSet;
import java.util.Scanner;
//write java program to identify and form a string with unique characters
public class StringwithUniqueChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		String input = scan.next();
		scan.close();
		boolean result=false;
		int len=input.length();
		HashSet < Character> uniquecharset= new HashSet<Character>();
		for (int i = 0; i < len; i++) {
			char a= input.charAt(i);	
			result=uniquecharset.add(a);	
			if (result == true)
				System.out.print(a);
		}
	}
}
