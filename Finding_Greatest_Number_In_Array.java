package coreJavaFundamentals;

public class Finding_Greatest_Number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//finding the Largest number among the given set of numbers in Array:
		int[]arr= {0,5,75,55,77,80,10};
		int max=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println(max+" is largest");
		
		
		
		
		/*
		//find the Largest Number:
		int []numbers= {1,2,15,7,9};
		int max=0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			
		}
		System.out.println(max+"is the largest");
		*/
		
		/*
		//Sorting Not Finding
		int[]number={3,4,1,5,15,16,10};
		int i=0;
		int max= number[i];
		while(i<number.length) {
			i++;
			if(number[i] > max) {
				max=number[i];
				System.out.println(max);
			}
		}
		*/

	}

}
