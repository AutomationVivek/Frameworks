package week2day1;

import java.util.Scanner;

public class PrintNumbersBtwtwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the input 1");
		int input1=scan.nextInt();
		System.out.println("Enter the input 2");
		int input2=scan.nextInt();
		scan.close();
		for ( ;input1 <= input2;input1++) {
			
			if (input1%3==0 && input1%5==0) 
				System.out.printf("FIZZBUZZ"+" ");
			else if  (input1%3==0)
				System.out.printf("FIZZ"+" ");
			else if  (input1%5==0)
				System.out.printf("BUZZ"+" ");
			else
				System.out.print(input1+" ");
		}
	}

}
