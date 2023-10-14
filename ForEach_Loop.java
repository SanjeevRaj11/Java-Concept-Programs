package coreJavaFundamentals;

public class ForEach_Loop {

	public static void main(String[] args) {
		
		/*
		 for-each loop is used to iterate only in UniDirectional -(forward direction) [Left to right] through the elements of "ARRAYS" and "COLLECTIONS".
		 it returns the output 1 by 1.
		*/
		System.out.println("-----ForEach Loop1------");
		int [] numbs = { 10,20,30,40,50,60};
		int total = 0;
		//ForEach Loop1 :
		for(int n1 : numbs) {
			System.out.println(n1);
			total += n1; 
		}
		
		System.out.println("____________");
		System.out.println("total = "+total);//210
		System.out.println("____________");
		
		
		System.out.println("-----ForEach Loop2------");
		String [] names = {"Suriya","Vijay","Ajith","Vikram","Kamal"};
		//ForEach Loop2 :
		for(String actors : names) {
			System.out.print(" "+actors+" ");
		}

	}

}
