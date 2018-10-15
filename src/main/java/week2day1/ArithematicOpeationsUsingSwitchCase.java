package week2day1;

import java.util.Scanner;

public class ArithematicOpeationsUsingSwitchCase {

	public static void main(String[] args) {
		
		/*1.Write a Java Program to get 3 user inputs 
		Two Numbers 
		One String which can be either of the below “Add”/”Subtract”/“Multiply”/”Divide”
		2. Perform the equivalent arithmetic operation.
		3. Print the result in the console.*/

		Double var1,var2;
		Scanner getinput=new Scanner(System.in);
		//get input for var1
		System.out.println("Enter the First number:");
		var1=getinput.nextDouble();
		//get input for var2
		System.out.println("Enter the Second number:");
		var2=getinput.nextDouble();
		//get input for operation
		System.out.println("Enter the Operation:Add/Subtract/Multiply/Divide:");
		String oper1=getinput.next();
		switch(oper1)
		{
		case "Add":
			System.out.println("Addition of " + var1 + " and " + var2 + " is " + (var1 + var2));
			break;
		case "Subtract":
			System.out.println("Subtraction of " + var1 + " and " + var2 + " is " + (var1 - var2));
			break;
		case "Multiply":
			System.out.println("Multiplication of " + var1 + " and " + var2 + " is " + (var1 * var2));
			break;
		case "Divide":
			if (var2 != 0)
				System.out.println("Division of " + var1 + " and " + var2 + " is " + (var1 / var2));
			else
				System.out.println("Division cannot be performed for the entered second number (Zero)");
			break;
		default:
			System.out.println("Enter a Valid Operation");
		}
		getinput.close();
	}
}
		/*int result;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the input1");
		int input1=scan.nextInt();
		System.out.println("Enter the input2");
		int input2=scan.nextInt();
		System.out.println("Enter the opreation to be perform");
		String opreation=scan.next();
		scan.close();
		
		if (opreation.equals("Add"))
		{
			result=input1+input2;
			System.out.println("addtion of "+input1+ " and "+input2+ " is "+result);
		}
		else if (opreation.equals("Sub"))
		{
			result=input1-input2;
			System.out.println("subration of "+input1+ " and "+input2+ " is "+result);
		}
		else if (opreation.equals("Mul"))
		{
			result=input1*input2;
			System.out.println("Multiplication of "+input1+ " and "+input2+ " is "+result);
		}
		else if (opreation.equals("Div"))
		{
			result=input1/input2;
			System.out.println("division of "+input1+ " and "+input2+ " is "+result);
		}
		else
		{
			System.out.println("Select any one opearion to be done");
		}*/


