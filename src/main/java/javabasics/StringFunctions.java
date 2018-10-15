package javabasics;

//pass ip from run as->configuration->arg tab
public class StringFunctions {

	public static void main(String[] args) {
		System.out.println(args[6]);
		for(String var : args)
		{
			System.out.println(var);
			//System.out.printf(var);
		}

	}
}

