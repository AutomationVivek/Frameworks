package week2day1;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4=4*3*2*1
		int fac=1;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the input for factorial calculation");
		int input=scan.nextInt();
		scan.close();
		if (input <= 0 )
		{
			System.out.println("Enter vaild number greater than Zero");
		}
		else if (input > 0)
		{
		for (int i = 1; i <= input; i++) {
			fac=fac*i;
				}	
		System.out.println("the factorical of "+input + " is " +fac);
		}	
	}

}
