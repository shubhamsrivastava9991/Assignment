package phase1javaassignment;

public class Stringbuffereg {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("Started Java");
		
		System.out.println(s);
		
		s.append("Phase1");
		
		System.out.println(s);
		
		s.delete(2, 5);
		
		System.out.println(s);
		
		s.replace(5, 9, "Python");
		System.out.println(s);
		
		s.insert(4, "Language");
		System.out.println(s);
		
		s.reverse();
		System.out.println(s);
		
		System.out.println(s.charAt(9));

	}

}

/* 
     Output

Started Java
Started JavaPhase1
Sted JavaPhase1
Sted PythonPhase1
StedLanguage PythonPhase1
1esahPnohtyP egaugnaLdetS
t


*/
