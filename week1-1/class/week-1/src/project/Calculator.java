package project;

public class Calculator {
	
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	    int valueOne = 10; 
	    int valueTwo = 5;
		Calculator myCalculator = new Calculator();
		
		int addResult = myCalculator.add(valueOne, valueTwo); 
		int subValue = myCalculator.sub(valueOne, valueTwo); 	 
		int mulValue = myCalculator.mul(valueOne, valueTwo); 
		int divValue = myCalculator.div(valueOne, valueTwo); 
		System.out.println("add : " + addResult);
		System.out.println("sub : " + subValue); 
		System.out.println("mul : " + mulValue); 
		System.out.println("div : " + divValue);
		}
	
	 public int add(int valueOne, int valueTwo) {
		// TODO Auto-generated method stub
		
		return valueOne+valueTwo;
	}

	public int sub(int valueOne, int valueTwo) {
		// TODO Auto-generated method stub
		return valueOne-valueTwo;
	}

	public int mul(int valueOne, int valueTwo) {
		// TODO Auto-generated method stub
		
		return valueOne*valueTwo;
	}
	public int div (int valueOne,int valueTwo){
		  
		return valueOne/valueTwo;
	}


	}


