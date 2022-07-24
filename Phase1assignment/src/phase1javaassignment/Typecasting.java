package phase1javaassignment;

public class Typecasting {

	public static void main(String[] args) {
		
		//Conversion of float --> long data type 
		
		float f  = 25.678f;
		long l = (long)f;  //explicit type casting
		
		System.out.println("The conversion of float datatype value of: " + f + " " + "to long datatype value is: " + l);
		
		//Conversion of double --> long --> --> int --> char data type
		
		double d = 89.564879;
		long g = (long) d; //explicit type casting
		int i = (int) g;  //explicit type casting
		char c = (char) i; //explicit type casting
		
		System.out.println("The conversion of double datatype value of: " + d + " " + "to long datatype value is:" + g);
		System.out.println("The conversion of long datatype value of: " + g + " " + "to int datatype value is: " + i);
		System.out.println("The conversion of int datatype value of: " + i + " " + "to char datatype value is: " + c);
		
		//Conversion of long --> byte data type
		
		long h = 8954672;
		byte b = (byte) h; //explicit type casting
		
		System.out.println("The conversion of long datatype value of: " + h + " " + "to byte datatype value is: " + b);
		
		//Conversion of int --> double --> long
		
		int j = 256;
		double k = j; //implicit type casting
		long n = (long) k; // explicit type casting
		
		System.out.println("The conversion of int datatype value of: " + j + " " + "to double datatype value is:" + k);
		System.out.println("The conversion of double datatype value of: " + k + " " + "to long datatype value is:" + n);

	}

}

/*
           Output
                 
The conversion of float datatype value of: 25.678 to long datatype value is: 25
The conversion of double datatype value of: 89.564879 to long datatype value is:89
The conversion of long datatype value of: 89 to int datatype value is: 89
The conversion of int datatype value of: 89 to char datatype value is: Y
The conversion of long datatype value of: 8954672 to byte datatype value is: 48
The conversion of int datatype value of: 256 to double datatype value is:256.0
The conversion of double datatype value of: 256.0 to long datatype value is:256
 
*/
