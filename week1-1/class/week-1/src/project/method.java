package project;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {34,54,64,42,34,56,44,65,87,23,57,74};
		int biggestNumber = biggestNumber(numArray); 
		int smallestNumber = smallestNumber(numArray);
        System.out.println("Biggest Number:"+biggestNumber);
        System.out.println("Smallest Number:"+smallestNumber);
	}
	
	public static int biggestNumber(int[] numArray) {
		// TODO Auto-generated method stub
		int bigValue=numArray[0];
		for(int i=1;i < numArray.length;i++){
			if(numArray[i] > bigValue){
				bigValue= numArray[i];
			}
		}
		return bigValue;
	}
	public static int smallestNumber(int[] numArray) {
		// TODO Auto-generated method stub
		int smallValue=numArray[0];
		for(int i=1;i < numArray.length;i++){
			if(numArray[i] < smallValue){
				smallValue= numArray[i];
			}
		}
		return smallValue;
	}
}
