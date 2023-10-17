package coreJavaFundamentals;

class Program1{
	
	
	public void show(int x, int y){
		System.out.println("x-y= "+ (x-y));
	};
}

class Program2 extends Program1 {
	
	
	public void show(int x, int y) { //without changing the methodSignature-line, returnType and Parameters, method overRiding is achieved.
		System.out.println("x+y "+(x+y));
	}
}

public class MethodOverRiding extends Program2 {

	public static void main(String[] args) {
		
	MethodOverRiding obj = new MethodOverRiding();
	obj.show(30,20);//50
		
	}
}
