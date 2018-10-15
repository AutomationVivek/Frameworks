package package3multilevelinheritance;

public class ClassD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA objA=new ClassA();
		ClassB objB=new ClassB();
		ClassC objC=new ClassC();
		//class A 
		int inputDA1=objA.inputA1;
		int inputDA3=objA.inputA3;
		int inputDA4=objA.inputA4;
		objA.ma1();
		objA.ma3();
		objA.ma4();

		//class b
		//from class b
		int inputDB1=objB.inputB1;
		int inputDB3=objB.inputB3;
		int inputDB4=objB.inputB4;
		objB.mb1();
		objB.mb3();
		objB.mb4();
		//from class A via classb
		int inputDAB1=objB.inputA1;
		int inputDAB3=objB.inputA3;
		int inputDAB4=objB.inputA4;
		objB.ma1();
		objB.ma3();
		objB.ma4();

		//class c
		//from classc
		int inputDC1=objC.inputC1;
		int inputDC3=objC.inputC3;
		int inputDC4=objC.inputC4;
		objC.mc1();
		objC.mc3();
		objC.mc4();
		//from class b via class c
		int inputDBC1=objC.inputB1;
		int inputDBC3=objC.inputB3;
		int inputDBC4=objC.inputB4;
		objC.mb1();
		objC.mb3();
		objC.mb4();
		//from class A via classc
		int inputDAC1=objC.inputA1;
		int inputDAC3=objC.inputA3;
		int inputDAC4=objC.inputA4;
		objC.ma1();
		objC.ma3();
		objC.ma4();

	}

}
