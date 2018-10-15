package javabasics;

public class StringLiterals {

	void m1(String s1,String s2)
	{
		//case1
		if(s1==s2)
		{
			System.out.println("both strings "+ s1 +" & "+ s2 + " are same");
		}
		else
		{
			System.out.println("both strings "+ s1 +" & "+ s2 + " are not same");
		}
		//case2
		if (s1.equals(s2))
		{
			System.out.println("both strings "+ s1 +" & "+ s2 + " are same");
		}
		else
		{
			System.out.println("both strings "+ s1 +" & "+ s2 + " are not same");
		}
		//case3
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("both strings "+ s1 +" & "+ s2 + " are same");
		}
		else
		{
			System.out.println("both strings "+ s1 +" & "+ s2 + " are not same");
					}
		//case4
		if(s1.contains(s2))
		{
			System.out.println("string1 "+ s1 +" is avaiable in string2 "+ s2);
		}
		else
		{
			System.out.println("string1 "+ s1 +" is not avaiable in string2 "+ s2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="TestLeaf Java";
		String str2="TestLeaf Java";
		String str3=new String("TestLeaf Java");
		String str4=new String("testleaf java");
		String str5= new String("Java");

		StringLiterals lit = new StringLiterals();
		lit.m1(str1, str2);
		lit.m1(str1, str3);
		lit.m1(str1, str4);
		lit.m1(str3, str5);
	}

}
