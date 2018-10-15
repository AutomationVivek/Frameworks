package javabasics;

import package2accessmodi.ClassA;

public class AccessModifier extends ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassA access=new ClassA();
		AccessModifier access=new AccessModifier();
		
		int callingIp1=access.input1;
		int callingIp4=access.input4;
		System.out.println(callingIp1  + callingIp4);
		access.m1();
		access.m4();
	}

}
