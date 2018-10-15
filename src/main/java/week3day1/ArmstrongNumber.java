package week3day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,sum = 0;
		System.out.println("Armstrong numbers from 100 to 1000:");
		for (int i = 100; i <= 1000; i++)
		{
			num = i;
			while (num > 0)
			{
				rem = num % 10;
				sum = sum + (rem*rem*rem);
				num = num / 10;
			}
	 
			if (sum == i)
			{
				System.out.println("the armstrong number is " +i);
			}
			sum = 0;
		}
	}

}
