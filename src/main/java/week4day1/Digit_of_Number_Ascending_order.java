package week4day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Digit_of_Number_Ascending_order {

	public static void main(String[] args) {
		boolean result=false;
		Scanner scan = new Scanner(System.in);  
		System.out.print("Please enter a string: ");  
		int input = scan.nextInt();
		scan.close();
		String d=Integer.toString(input);
		char[] charArray = d.toCharArray();
		Arrays.sort(charArray);
		HashSet < Character> uniquecharset= new HashSet<Character>();
		for (char c : charArray) {
			result=uniquecharset.add(c);
			if (result == true)
				System.out.print(c);
		}	
	}
}
//method2:
/*Scanner scan = new Scanner(System.in);
int quotient,remainder;
//int count=0;
int inputNumber = scan.nextInt();
ArrayList<Integer> integerList = new ArrayList<Integer>();
while(inputNumber!=0) {
quotient = inputNumber/10;
remainder = inputNumber%10;
inputNumber = quotient;
//count++;
integerList.add(remainder);
}
Collections.sort(integerList);
System.out.println(integerList);
Set<Integer> set = new HashSet<Integer>(integerList);
System.out.println(set);

}*/

//method3
/*/Get the Input Number 
Scanner scan=new Scanner(System.in);
System.out.println("Enter the input number");
int digits=scan.nextInt();
//Create the variables rem and div
int rem,div;


// Use LinkedHashSet collection to remove the duplicate values	
Set<Integer> dup=new LinkedHashSet<Integer>();
// Use for loop to split the digits and then add it into HashSet object	
for(int i=digits;i>0;i/=10)
{
div=digits/10;
rem=digits%10;
digits=div;
dup.add(rem);
}
// use Sort function to sort the output numbers
dup.stream().sorted().forEach(System.out::print);


}

}*/