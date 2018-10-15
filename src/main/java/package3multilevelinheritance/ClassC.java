package package3multilevelinheritance;

public class ClassC extends ClassB {
	public int inputC1=1;
	private int inputC2=2;
	int inputC3=3;
	protected int inputC4=4;
	
	public void mc1()
	{
		System.out.println("Am public method classC");
	}
	
	private void mc2()
	{
		System.out.println("Am private method classC");
	}
	
	void mc3()
	{
		System.out.println("am default classC");
	}
	
	protected void mc4()
	{
		System.out.println("am protected classC");
	}
	
	
}
