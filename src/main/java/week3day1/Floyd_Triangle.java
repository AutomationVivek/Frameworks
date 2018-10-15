package week3day1;

import java.util.Scanner;

public class Floyd_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, num = 1, i, j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows of floyd's triangle you want");
		n = scan.nextInt();
		scan.close();
		System.out.println("Floyd's triangle :-");
		for ( i = 1 ; i <= n ; i++ )
		{
			for ( j = 1 ; j <= i ; j++ )
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
