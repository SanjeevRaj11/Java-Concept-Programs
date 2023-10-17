package coreJavaFundamentals;

public class Looping_Conditions {
	
	public static void main(String [] aregs) {
		/*
		Which looping is best in Java?
		If the number of iteration is fixed, it is recommended to use "for" loop.
		If the number of iteration is not fixed, it is recommended to use "while" loop. 
		If the number of iteration is not fixed and you must have to execute the loop at least once, 
														 it is recommended to use the "do-while" loop.
		*/
		
		//Write a program to print numbers from 1 to 10.--------------------------------------
		
		//For Loop
		System.out.println("For loop");
		for(int i=1; i<=10; i++) {
			System.out.println("number ="+i);
		}
		System.out.println();
		//While Loop
		System.out.println("While Loop");
		int i1=1;
		while(i1<=10) {
			System.out.println("number ="+i1);
			i1++;
		}
		System.out.println();
		//Do While Loop
		System.out.println("Do while");
		int i2=1;
		do {
			System.out.println("number ="+i2);
			i2++;
		}while(i2<=10);
		System.out.println();
		//Write a program to calculate the sum of first 10 natural number.
		
		//For Loop
		System.out.println("For Loop: sum of 1st ten natural numbers");
		int sum=0;
		for(int i3=1;i3<=10;i3++) {
			 sum = sum+ i3;
		}
		System.out.println("sum: final value="+sum);
		
		
		System.out.println();
		//While Loop
		System.out.println("While Loop: sum of 1st ten natural numbers");
		int i4=1;
		int sum2=0;
		while(i4<=10) {
			sum2 += i4;
			i4++;
		}
		System.out.println("sum: final value="+sum2);
		System.out.println();
		
		//Do While Loop
		System.out.println("Do While Loop: sum of 1st ten natural numbers");
		int total2=0;
		int i5=1;
		do {
			total2 += i5;
			i5++;
		}while(i5<=10);
		System.out.println("sum: final value="+total2);
		System.out.println();
		
		//Write a Program to print the Numbers from 10 to 1.
		//For Loop
		System.out.println("For Loop: Numbers from 10 to 1.");
		for(int i=10; i>=1; i--) {
			System.out.println("numbers in reverse ="+i);
		}
		System.out.println();
		//While Loop
		System.out.println("While Loop: Numbers from 10 to 1.");
		int i6=10;
		while(i6>=1) {
			System.out.println("numbers in reverse ="+i6);
			i6--;
		}
		System.out.println();
		//Do While Loop
		System.out.println("Do While Loop: Numbers from 10 to 1.");
		int numb=10;
		do {
			System.out.println("numbers in reverse ="+numb);
			numb--;
		}while(numb>=1);
		System.out.println();
		

		//Write a program: Multiplication of numbers
		int total=1;
		for(int i=1; i<=5; i++) {
			 total *= i;
		}
		System.out.println(total);
		System.out.println();
		//find out : only- Even numbers
		//For Loop
		System.out.println("For Loop: find out Even numbers");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.println("even numbs only"+i);
			}
		}
		System.out.println();
		//While Loop
		System.out.println("While Loop: find out Even numbers");
		int iteration=1;
		while(iteration<=100) {
			if(iteration%2==0) {
				System.out.println("even numbs ="+iteration);
				}
					
					iteration++;
		}
		System.out.println();
		//Find out Even and Odd numbers:
		//For Loop
		System.out.println("For Loop: Find out Even & Odd numbers");
		for(int i=1; i<=100; i++) {
			if(i%2==1) {
				System.out.println("odd numbs"+i);
			}
			else if(i%2==0) {
				System.out.println("even numbs"+i);
			}
			 
		}
		System.out.println();
		
		
		
		System.out.println("***********");
	
		
		
		
	}//main method closing area.

}
