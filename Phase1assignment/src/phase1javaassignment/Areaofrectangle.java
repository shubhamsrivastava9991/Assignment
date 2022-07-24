package phase1javaassignment;

public class Areaofrectangle {
	
	//Method for calculating area 
	int area(int l, int b){
		return l*b;
	}

	public static void main(String[] args) {
		
		//Creating the object 
		Areaofrectangle ar = new Areaofrectangle();
		
		//Calling the method and storing the return value to the variable 
		int result = ar.area(25,15);
		System.out.println("Area of Rectangle is: " + result);
	}

}

/*
 Output
 
 Area of Rectangle is: 375
 
 */
