package phase1javaassignment;

public class Areaofrectangle {
	
	int area(int l, int b){
		return l*b;
	}

	public static void main(String[] args) {
		
		Areaofrectangle ar = new Areaofrectangle();
		
		int result = ar.area(25,15);
		System.out.println("Area of Rectangle is: " + result);
	}

}
