package week3day1;

public class Mulitiplesof_3and5 {

	/*public static int sumofdig(int dig)
	{
		int mul=0,i=1,sum=0;
		while (mul<20) {	
			mul=i*dig;
			if (mul >=20) {
			break;
			}
			else {
				System.out.println("multiples of "+ dig +" is: "+mul);
			}	
			 sum=sum+mul;
			i++;
		}
		System.out.println("sum of muliples of "+dig +"is :"+sum);
		return sum;
	}*/
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i < 100; i++) {
			if ((i%3==0) || (i%5==0)) {
				sum=sum+i;
			}
		}
//		int sum3=sumofdig(3);
//		int sum5=sumofdig(5);
//		int sum=sum3+sum5;
	System.out.println(sum);
	}
}
