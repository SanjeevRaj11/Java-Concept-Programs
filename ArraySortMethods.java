package coreJavaFundamentals;

import java.lang.reflect.*;
import java.util.Arrays;

public class ArraySortMethods {

	public static void main(String[] args) {

		
		int [] arr = {5,1,9,7,4,8,6,3,2};//Primitive type
		String [] strArr = {"Cat","Ball","Elephant","Apple","Dog"};//NonPrimitive type
		
		System.out.println("before sorting int[]:<--------------<");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		Arrays.sort(arr);//Primitive type
		
		System.out.println("after sorting int[]:<--------------<");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println("before sorting String[]:<--------------<");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();
		
		Arrays.sort(strArr);//NonPrimitive type
		
		System.out.println("after sortting String[]:<--------------<");
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println();
		
		
	}

}
