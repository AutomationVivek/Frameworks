package javabasics;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row, col, i, j;
		String arr[][] = new String[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Row for Array (max 3) : ");
		row = scan.nextInt();
		System.out.print("Enter Number of Column for Array  : ");
		col = scan.nextInt();
		//scan.close();

		System.out.print("Enter " +(row*col)+ " Array Elements : ");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				arr[i][j] = scan.next();
				System.out.println(arr[i][j]);
			}
		}
		scan.close();

		System.out.print("The Array is :\n");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
		
	}

}
