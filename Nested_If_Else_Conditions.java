package coreJavaFundamentals;

public class Nested_If_Else_Conditions {

	//main method starting point
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//finding the largest number of 3 values - Using NESTED "If Else" condition.
		
		int a1 = 1000;
		int b1 = 250;
		int c1 = 2500;
		
		if(a1>b1) {
			if(a1>c1) {
				System.out.println("a is largest.");
			}
			else if(c1>a1) {
				System.out.println("c is largest.");
			}
			else {
				System.out.println("a and c are equal");
			}
		}
		
		else if(b1>a1){
			if(b1>c1) {
				System.out.println("b is largest.");
			}
			else if(c1>b1){
				System.out.println("c is largest");
			}
			else {
				System.out.println("b and c are equal and were largest");
			}
		}
		
		else {
			if((a1&b1)>c1) {
				System.out.println("a and b is equal and were largest");
			}
			else if(c1>(a1&b1)) {
				System.out.println("c is largest");
			}
			else {
				System.out.println("all numbers are equal...");
			}
		}
		
		
		int a = 1;
		int b = 33;
		int c = 333333;
		int d = 333333;
		
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a is largest");
				}
				else if(d>a) {
					System.out.println("d is largest");
				}
				else {
					System.out.println("d and a is largest");
				}
			}
			
		else if(c>a){
				if(c>d) {
					System.out.println("c is largest");
				}
				else if(d>c) {
					System.out.println("d is largest");
				}
				else {
					System.out.println("d and c is largest");
				}
			}
			
		else if((c&a)>d) {
				System.out.println("c and a is largest");
			}
			
		else if(d>(c&a)) {
				System.out.println("d is largest");
			}
			
		else {
				System.out.println("a, c and d is largest");
			}
		}
		
		else if(b>a) {
			if(b>c) {
				if(b>d) {
					System.out.println("b is largest");
				}
				else if(d>b) {
					System.out.println("d is largest");
				}
				else {
					System.out.println("d and b is largest");
				}
			}
			
			else if(c>b) {
				if(c>d) {
					System.out.println("c is largest");
				}
				else if(d>c) {
					System.out.println("d is largest");
				}
				else {
					System.out.println("d and c is largest");
				}
			}
			
			else if((b&c)>d) {
				System.out.println("b and c is largest");
			}
			
			else if(d>(b&c)) {
				System.out.println("d is largest");
			}
			
			else {
				System.out.println("b,c and d are largest");
			}
		}
			
	
		
		else if((b&a)>c) {
			if((a&b)>d) {
				System.out.println("a and b is largest");
			}
			else if(d>(a&b)) {
				System.out.println("d is largest");
			}
			else {
				System.out.println("a, b, and d is largest");
			}
		}
		
		else if(c>(b&a)) {
			if(c>d) {
				System.out.println("c is largest");
			}
			else if(d>c) {
				System.out.println("d is largest");
			}
			else {
				System.out.println("d and c is largest");
			}
		}
		
		else if((a&b&c)>d) {
			System.out.println("a,b,c is largest");
		}
		
		else if(d>(a&b&c)) {
			System.out.println("d is largest");
		}
		else {
			System.out.println("a, b, c, and d are equal and same...");
		}
				


		
		
		
		
		

	}//main method ending point

}
