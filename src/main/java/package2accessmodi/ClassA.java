package package2accessmodi;

public class ClassA {
	public int input1=1;
	private int input2=2;
	int input3=3;
	protected int input4=4;
	
	public void m1()
	{
		System.out.println("Am public method");
	}
	
	private void m2()
	{
		System.out.println("Am private method");
	}
	
	void m3()
	{
		System.out.println("am default");
	}
	
	protected void m4()
	{
		System.out.println("am protected");
	}
	
	
	
	

}
