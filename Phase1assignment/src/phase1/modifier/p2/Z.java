package phase1.modifier.p2;

import phase1.modifier.p1.M;
import phase1.modifier.p1.N;
import phase1.modifier.p1.P;

public class Z extends M{
	
	public static void main(String[] args) {
		
		System.out.println("This is Class Z");
		
		new M().methodpublic();
		new Z().methodprotected();
		new N().methodNpublic();
		new P().methodPpublic();
		
		X ob = new X();
		System.out.println("CLass X value of long is: " + ob.g);
		System.out.println("CLass X value of float is: " + ob.h);
		System.out.println("CLass X value of char is: " + ob.i);
	}

}

/*
    Output
    
This is Class Z
Class M Public Method
Class M Protected Method
Class N Public Method
Class P Public Method
CLass X value of long is: 9501
CLass X value of float is: 35.6
CLass X value of char is: y

*/