package phase1.modifier.p1;

public class P{
	
	public void methodPpublic(){
		System.out.println("Class P Public Method");
		
	}
	
	private void methodPprivate(){
		System.out.println("Class P Private Method");
	}
	
	void methodPdefault(){
		System.out.println("Class P Default Method");
	}
	
	protected void methodPprotected(){
		System.out.println("Class P Protected Method");
	}

	public static void main(String[] args) {
		
		System.out.println("This is Class P");
		
		M ob1 = new M();
		System.out.println("Value of class M long is: " + ob1.b);
		System.out.println("Value of class M float is: " + ob1.c);
		
		N ob2 = new N();
		System.out.println("Value of class N int is: " + ob2.d);
		System.out.println("Value of class N long is: " + ob2.e);
		System.out.println("Value of class N double is: " + ob2.f);
		
	}

}


/*
     Output
     
This is Class P
Value of class M long is: 535
Value of class M float is: 20.78
Value of class N int is: 30
Value of class N long is: 750
Value of class N double is: 150.5    

*/