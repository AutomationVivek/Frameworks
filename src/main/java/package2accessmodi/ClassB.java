package package2accessmodi;


public class ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA access=new ClassA();
		int callingIp1=access.input1;
		int callingIp3=access.input3;
		int callingIp4=access.input4;
		System.out.print(callingIp1 + callingIp3 + callingIp4);
		access.m1();
		access.m3();
		access.m4();





	}

}
