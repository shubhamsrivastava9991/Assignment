package phase1.modifier.p2;

import phase1.modifier.p1.M;
import phase1.modifier.p1.N;

public class Y extends N{

	public static void main(String[] args) {
		
		System.out.println("This is Class Y");
		
		new M().methodpublic();
		new Y().methodNprotected();
		new N().methodNpublic();
		
		X ob = new X();
		System.out.println("CLass X value of long is: " + ob.g);
		System.out.println("CLass X value of float is: " + ob.h);
		System.out.println("CLass X value of char is: " + ob.i);
		
	}
}

/*

    Output

This is Class Y
Class M Public Method
Class N Protected Method
Class N Public Method
CLass X value of long is: 9501
CLass X value of float is: 35.6
CLass X value of char is: y
    
*/