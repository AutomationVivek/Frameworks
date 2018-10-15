package package3multilevelinheritance;

public class ClassB extends ClassA{
	public int inputB1=1;
	private int inputB2=2;
	int inputB3=3;
	protected int inputB4=4;
	
	public void mb1()
	{
		System.out.println("Am public method classB");
	}
	
	private void mb2()
	{
		System.out.println("Am private method classB");
	}
	
	void mb3()
	{
		System.out.println("am default classB");
	}
	
	protected void mb4()
	{
		System.out.println("am protected classB");
	}
	
	

}
