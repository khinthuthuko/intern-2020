package project;

public class MethodOverloading {
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		sum(10, 20); 
		sum(10, 20, 40);  
	}

	public static void sum(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("The two number:"+(i+j));
	} 
	public static void sum(int i, int j,int k) {
		// TODO Auto-generated method stub
		
		System.out.println("The two number:"+(i+j+k));
	}
	

	


}
