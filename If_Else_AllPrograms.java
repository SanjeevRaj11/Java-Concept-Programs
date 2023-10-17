package coreJavaFundamentals;

public class If_Else_AllPrograms {

	public static void main(String[]args) {
		
		//find out the Largest of 2 values.
		Largest(0,20);
		
		//find out the Largest number of 3 values.
		 Largest(100,100,100);
		 
		//find out the Largest of 4 values. 
		 Largest(1,2,3,4);
		
	}//main method closing point
	
	static void Largest(int x, int y) {
		if(x>y) {
			System.out.println("a is largest");
		}
		else if(y>x) {
			System.out.println("b is largest");
		}
		else if(x == y) {
			System.out.println("a and b are equal and same...");
		}
	}
	
	//------------------------------------------------------------------
	  static void Largest(int x, int y, int z){
	
		if(x>y)
		{
			if(x>z) {
				System.out.println("x is largest");
			}
			else if(z>x) {
				System.out.println("z is largest");
			}
			else if(z==x) {
				System.out.println("z and x are largest");
			}
		}
		
		else if(y>x) {
			if(y>z) {
				System.out.println("y is largest");
			}
			else if(z>y) {
				System.out.println("z is largest");
			}
			else if(z==y) {
				System.out.println("z and y are largest");
			}
		}
		
		else if((x&y)>z) {
			System.out.println("x and y is largest");
		}
			
		else if(z>(x&y)) {
			System.out.println("z is largest");
		}
			
		else if((x&y)==z) {
			System.out.println("x,y and z all are equal and same");
		}
		
		
		}
	  
	  //-----------------------------------------------------------------------------------
	  
	  static void Largest(int a, int b, int c, int d) {
		  if(a>b) {
			  if(a>c) {
				  System.out.println("a is largest");
			  }
			  
			  else if(c>a) {
				  System.out.println("c is largest");
			  }
			  
			  
			  else if((a&c)>d) {
				  System.out.println("a and c are largest");
			  }
				  
			  else if(d>(a&c)) {
				  System.out.println("d is largest");
			  }
			
			  else if((a&c)==d) {
				  System.out.println("a,c and d are equal and largest");
				  
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
				  else if(d==b) {
					  System.out.println("b and d are largest");
				  }
			  }
			  else if(c>b) {
				  if(c>d) {
					  System.out.println("c is largest");
				  }
				  else if(d>c) {
					  System.out.println("d is largest");
				  }
				  else if(c==d) {
					  System.out.println("c and d are largest");
				  }
			  }
			  
			  else if((b&c)>d) {
				  System.out.println("b and c are largest");
			  }
			  else if(d>(b&c)) {
				  System.out.println("d is largest");
			  }
			  else if((b&c)==d) {
				  System.out.println("b,c and d are largest");
			  }
		  }
			  
		  else if((b&a)>c) {
			  if((b&a)>d) {
				  System.out.println("b and a are largest");
			  }
			  else if(d>(b&a)) {
				  System.out.println("d is largest");
			  }
			  else if((a&b)==d) {
				  System.out.println("a,b and d are largest");
			  }
			  
		  }

		  else if(c>(b&a)) {
			  if(c>d) {
				  System.out.println("c is largest");
			  }
			  else if(d>c) {
				  System.out.println("d is largest");
			  }
			  else if(c==d) {
				  System.out.println("c and d are largest");
			  }
			  
		  }
			
		  else if((a&b&c)>d) {
			  System.out.println("a,b and c are largest");
		  }
			  
		  else if((a&b)==(c&d)) {
			  System.out.println("a,b,c and d are equal and same");
		  }
		  
	  }
	  
}
