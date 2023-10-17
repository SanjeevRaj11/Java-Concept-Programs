package coreJavaFundamentals;

public class JavaMethods {

	//main method starting point 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaMethods obj1 = new JavaMethods();
		
		
//		System.out.println("value is "+(obj1.addition(15,11))); // return value is printed
		int output1 = obj1.addition(15,11);
		System.out.println("value is "+output1);
		
		
		obj1.subtraction(15,11); //no return value. because no return keyword is mentioned in defintion block.
		
		int Area1 = obj1.area(10);
		System.out.println("area o/p is "+Area1);
		

		
	}//main method closing point.
	
	

	int area(int a){
		int Area = a*a;
		return Area;
	}
	
	void subtraction(int a, int b) {
		int c = a-b;
		System.out.println("value 2 is "+c); // No return keyword is mentioned.	 
	}
	
	int addition(int a, int b){
		int c = a+b;
		return c;
	}
	
 
	
	
	
}
