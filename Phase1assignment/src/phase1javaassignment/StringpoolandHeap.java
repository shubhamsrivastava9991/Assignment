package phase1javaassignment;

public class StringpoolandHeap {

	public static void main(String[] args) {
		
		String t = "Delhi";
		String o= "Mumbai";
		String k= "delhi";
		String y= new String("Mumbai");
		String l= new String("delhi");
		String p = new String("Hello");
		
		if(o.equals(l)){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(o == l){
			System.out.println("True");
		}else {
			System.out.println("false");
		}

		if(y.equals(p)){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(y == p){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(t.equals(o)){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(t == o){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(k.equals(y)){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(k == y){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(p.equals(y)){
			System.out.println("True");
		}else {
			System.out.println("false");
		}
		
		if(p == y){
			System.out.println("True");
		}else {
			System.out.println("false");
		}

	}
}

/*
     Output

false
false
false
false
false
false
false
false
false
false

*/
