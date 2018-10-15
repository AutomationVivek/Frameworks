package week3day1;

import java.util.Scanner;

public class Second_Largest_Number {
	public static void main(String[] args) {  
		//method1:
		/*Scanner scan= new Scanner(System.in);
		System.out.println("Enter the input number");
		int input=scan.nextInt();
		System.out.println("Enter the digit");
		int digit=scan.nextInt();
		scan.close();
		int r,temp = 0,flag = 0;
		for (int i = input; i >=0; i--) {
			temp=i;
			while(temp>0){ 
				r=temp%10; 
				if (r==digit) {
					flag=1;
				}
				temp=temp/10; 
			}
			if (flag==1) {
				flag=0;
			}  
			else
			{
				System.out.println("the second highest number is  "+i);
				break;
			}
		}*/
		//method2:
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int dig=scan.nextInt();
		scan.close();
		String d=Integer.toString(dig);


		for(int i=num-1;i>1;i--) 
		{
		String n=Integer.toString(i);
		//System.out.println(n);
		if(n.contains(d))
		{
		continue;
		}
		else
		System.out.println(i);
		break;
		}

		}
	
}
