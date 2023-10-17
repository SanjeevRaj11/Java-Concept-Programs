package coreJavaFundamentals;

public class MethodOverLoading {

	
	public static void main(String[] args) {
		
		Display();
		Display(11);
		Display(11,"Sanjeev");
		
	}

	private static void Display(int i, String string) {
		System.out.println(i +" and "+ string);
	}

	private static void Display(int i) {
		System.out.println(i);
	}

	private static void Display() {
		System.out.println("_");
	}
}
