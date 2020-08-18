package Assignment;

public class TestEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation(); 
         
        obj.setName("Khin"); 
        obj.setAge(21); 
        obj.setRoll(51); 
          
        System.out.println("My name is: " + obj.getName()); 
        System.out.println("age: " + obj.getAge()); 
        System.out.println("roll: " + obj.getRoll()); 
          
	}

}
