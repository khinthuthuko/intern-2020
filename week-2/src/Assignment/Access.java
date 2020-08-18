package Assignment;

public class Access {
    
	    private String name;

	    public String getName() {
	        return this.name;
	    }
	   
	    public void setName(String name) {
	        this.name= name;
	    }
	    protected void display(){
	    	System.out.println("This is protected access");
	    }
	    
	    public int addTwoNumbers(int a, int b){
	    	return a+b;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p=new Person();
        Access a=new Access();
        p.message();
        a.setName("Programiz");
        System.out.println(a.getName());
        a.display();
        System.out.println(a.addTwoNumbers(100, 1));
       
	}

}
