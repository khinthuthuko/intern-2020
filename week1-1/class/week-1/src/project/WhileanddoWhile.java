package project;

public class WhileanddoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 1;
        while (count < 3) {
            System.out.println("While statement is :" + count);
            count++;
      }
        while (count < 0){
        	System.out.println("While statement is" + count);
        	count++;
        }
        System.out.println("This Statement is Coming from Outside of while loop");
        do {
            System.out.println("Do While statement is: " + count);
            count++;
        } while (count < 3);
        System.out.println("This Statement is Coming from Outside of Do while loop");
        do {
            System.out.println("Do While statement is: " + count);
            count++;
        } while (count < 0);
        System.out.println("This Statement is Coming from Outside of Do while loop");
	}

}
