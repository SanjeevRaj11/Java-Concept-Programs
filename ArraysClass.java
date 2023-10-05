package coreJavaFundamentals;

public class ArraysClass {

	public static void main(String [] args) {
		
		//Java Arrays
		//Declaration of an Array and Assigning values to it.
		//dataType [] variable ={ no. of elements };
		String [] Array_Elements = { "element1", "element2", "element3", "etc" };
		
		//Creation of Integer Array
		int [] Numbers = { 1,2,3,4,5};
		//Creating an Array of Strings/Integers/Chars/Double.
		String [] actors = {"suriya", "vijay", "arjun", "kamal"};
		int [] numbers = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		char [] alphabets = {'a', 'b', 'c', 'd'};
		double [] decimals = {0.1, 1.5, 2.5, 3.5, 4.5, 5.0};
		
		
		//To Access the elements of an Array
		
		System.out.println(actors[0]);
		System.out.println(actors[1]);
		System.out.println(actors[2]);
		System.out.println(actors[3]);
		System.out.println();
		
		System.out.println("index 0 value is "+Numbers[0]);
		System.out.println("index 1 value is "+Numbers[1]);
		System.out.println("index 2 value is "+Numbers[2]);
		System.out.println("index 3 value is "+Numbers[3]);
		System.out.println("index 4 value is "+Numbers[4]);
		System.out.println();
		
		//Changing the Value of specific element in an Array
		String[] friends= {"Sakthi", "Yuvadhinan", "Vimal", "Sasi"};
		System.out.println("Before changing the value of specific element,"
						+ " friends name in Index 0 is "+friends[0] +" and " +friends[1]);
		
		friends[0]="Jefrin";
		friends[1]="Suriya";
		
		System.out.println("After changing the value of specific element,"
						+ " friends name in Index 0 is "+friends[0] +" and " +friends[1]);
		System.out.println();
		
		System.out.println(Array_Elements.length);
		System.out.println(Array_Elements[3]);
		Array_Elements[3]="element4";
		System.out.println(Array_Elements[3]);
		System.out.println();
		
		//To find out how many elements an array has, use the length property:
				System.out.println("Numbers Array length is "+Numbers.length);
				System.out.println("actors Array length is "+actors.length);
				System.out.println("numbers Array length is "+numbers.length);
				System.out.println("alphabets Array length is "+alphabets.length);
				System.out.println("decimals Array length is "+decimals.length);
				System.out.println();
		//Loop through Array.		
				
		String[]Gods= {"Shivan","Parvathi","Vinayagan","Murugan",
						"Hanuman","Raman","Seethai","Lakshamanan",
						"Krishnan","Karnan","Arjunan","Bheeman"};
		
		for(int i=0; i<Gods.length; i++) {
			System.out.println("Gods : "+Gods[i]);
		}
		System.out.println();
		
		//MultiDimensional Arrays
				
		int[][]array_of_arrays = { {1,2,3}, {4,5,6}, {7,8,9,10,11} };
		
		/*To access an Element:
	 -> two indexes [][]: one for the array, and one for the element inside that array.
	 -> Remember that: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.
		*/
		System.out.println(array_of_arrays[1][1]);//5.
		System.out.println(array_of_arrays[0][1]);//2.		
		System.out.println();
		
		//In Array of arrays to Change the Value of specific element:
		String[][]places = {{"vietnam","losangels"},
							{"switzerland","antartica"},
							{"dubai","russia","usa"},
							{"china","pakistan","afganistan"}};
		places[2][1]="India";
		places[3][0]="Japan";
		places[3][2]="Europe";
				System.out.println(places[3][2]);//Europe
				System.out.println(places[3][0]);//Japan
				System.out.println(places[2][1]);//India
	}
}
