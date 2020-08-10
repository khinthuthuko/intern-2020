package project;

public class Apk1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String hiper= superMethod();
		System.out.println(hiper);
		 Apk1 myApk = new Apk1(); 
		 myApk.hyperMethod(); 
		  int ultra=ultraMethod(); 
		 System.out.println(ultra);
		 }
	public static String superMethod(){
		System.out.println("This is super Methods...."); 
		return "Hiper Method" ; }
	
	public void hyperMethod() { 
		System.out.println("This is hyper Methods...."); }
	
	public static int ultraMethod() { 
		System.out.println("This is ultra Methods...."); 
		return 234; }
	}


