package week3day1;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Write a Java program to find the second maximum number in an integer array.
		int[] intArray = {20, 340, 21, 879, 92, 21,474,83647,-200};
		The second largest number is 879.
		Your code should work even when all the integers of the array is negative numbers.*/
		int a[]={13,67,88,65,-13,95,67,-65,87,95,-99,99};
		//Method 1 using arrays
		Arrays.sort(a);
		System.out.println("Largest Number: "+a[a.length-1]);
		System.out.println("Second Largest Number: "+a[a.length-2]);

		//method 2 using loop logic
		int n=a.length;
		int big = 0;		
		int secondbig = 0;
		for(int i=0;i<n;i++){
			if(big<a[i]){
				secondbig = big;
				big = a[i];
			} else if (a[i] != big && secondbig < a[i]){
				secondbig = a[i];			
			}
		}
		System.out.println(big+" is the first largest number.");
		System.out.println(secondbig+" is the second largest number.");
	}
}
