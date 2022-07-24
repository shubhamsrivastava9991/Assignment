package phase1javaassignment;

public class Methodoverloading {
	
	//Method to Add two number
	int calculate(int num1, long num2) {
		return (int)(num1 + num2);  //explicit conversion
	}
	
	//Method to calculate area of circle
	int calculate(int r) {
		return (int)(3.14*r*r);  //explicit conversion
	}
	
	//Method to calculate area of rectangle
	int calculate(int l, int b) {
		return l*b;
	}

	public static void main(String[] args) {
		
		//Creating object
		Methodoverloading obj = new Methodoverloading();
		
		//Calling Method to add two number and printing the result
		System.out.println("Addition of two number is: " + obj.calculate(20, 450L)); 
		
		//Calling Method to calculate area of circle and printing the result
		System.out.println("Area of circle is: " + obj.calculate(5));
		
		//Calling method to calculate area of rectangle and printing the result
		System.out.println("Area of rectangle is: " + obj.calculate(25,30));
	}

}

/*
       Output
            
Addition of two number is: 470
Area of circle is: 78
Area of rectangle is: 750

*/
