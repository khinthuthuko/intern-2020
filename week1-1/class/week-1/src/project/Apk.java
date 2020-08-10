package project;

public class Apk {
	
	 public static void main(String[] args) { 
		 superMethod();
		 Apk myApk = new Apk(); 
		 myApk.hyperMethod(); 
          int num=ultraMethod();
          System.out.println(num);
		 }
	public static String superMethod(){ 
		System.out.println("This is super Methods...."); 
		return "Hiper Method"; }
	
	public void hyperMethod() { 
		System.out.println("This is hyper Methods...."); }
	
	public static int ultraMethod() { 
		System.out.println("This is ultra Methods...."); 
		return 234; }
	 

}
