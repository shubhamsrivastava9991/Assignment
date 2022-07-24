package phase1.modifier.p1;

public class N {

	public int d = 30;
	protected long e = 750L;
	double f = 150.50;
	
	public void methodNpublic(){
		System.out.println("Class N Public Method");
		
	}
	
	private void methodNprivate(){
		System.out.println("Class N Private Method");
	}
	
	void methodNdefault(){
		System.out.println("Class N Default Method");
	}
	
	protected void methodNprotected(){
		System.out.println("Class N Protected Method");
	}
}