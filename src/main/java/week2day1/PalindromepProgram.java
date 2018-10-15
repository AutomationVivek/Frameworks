package week2day1;

import java.util.Scanner;

public class PalindromepProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the input for factorial calculation");
		int input=scan.nextInt();
		scan.close();
		temp=input;    
		while(input>0){    
			r=input%10;  //getting remainder  
			sum=(sum*10)+r;    
			input=input/10;    
		}    
		if(temp==sum)    
			System.out.println("palindrome number is "+temp);    
		else    
			System.out.println("not palindrome number is "+temp);    
	}  


}
