package package3multilevelinheritance;

public class ClassA {
	public int inputA1=1;
	private int inputA2=2;
	int inputA3=3;
	protected int inputA4=4;
	
	public void ma1()
	{
		System.out.println("Am public method classA");
	}
	
	private void ma2()
	{
		System.out.println("Am private method classA" + inputA2);
	}
	
	void ma3()
	{
		System.out.println("am default classA");
	}
	
	protected void ma4()
	{
		System.out.println("am protected classA");
	}
	
	 

}
