package phase1javaassignment;

public class Shape {
	int side, length, breadth, height;
	float radius, digonal1, digonal2;
	
	//Default Constructor
	Shape(){
		this.digonal1=0.0f; 
		this.digonal2=0.0f;
		this.length=10;
		this.height=20;
	}
	
	//Parameterized Constructor
	Shape(int s){
		side=s;
	}
	
	//Parameterized Constructor
	Shape(int l,int b){
		length= l;
		breadth=b;
	}
	
	//Parameterized Constructor
	Shape(float r){
		radius=r;
	}
	
	//Method to display area of square
	void displaysquarearea(){
		System.out.println("Area is of square is: " + (side*side));
	}
	
	//Method to display area of rectangle
	void displayrectanglearea(){
		System.out.println("Area is of rectangle is: " + (length*breadth));
	}
	
	//Method to display area of circle
	void displaycirclearea(){
		System.out.println("Area is of circle is: " + (3.14*radius*radius));
	}
	
	//Method to calculate area of rohmbus
	void calculate(float digonal1, float digonal2){
		this.digonal1= digonal1;
		this.digonal2= digonal2;
		System.out.println("Area of Rohmbus is: " + ((digonal1*digonal2)/2));
	}
	
	//Method to calculate area of triangle
	void calculate(){
		System.out.println("Area of triangle is: " + ((length*height)/2));
	}

	public static void main(String[] args) {
		
		//Creating object and passing the parameter 
		Shape s1= new Shape(10);
		Shape s2= new Shape(10,20);
		Shape s3= new Shape(2.5f);
		Shape s4= new Shape();
		
		//Calling method
		s1.displaysquarearea();
		s2.displayrectanglearea();
		s3.displaycirclearea();
		s4.calculate(10.5f,15.7f);
		s4.calculate();		
	}
}

/*
     Output
     
Area is of square is: 100
Area is of rectangle is: 200
Area is of circle is: 19.625
Area of Rohmbus is: 82.424995
Area of triangle is: 100  
      
 */
