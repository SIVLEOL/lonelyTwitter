package ca.ualberta.cs.lonelytwitter;

public class testSub extends abstr1 {

	private int result;
	
	public testSub(int int1, int int2){
		super(int1, int2);
		result = int1 - int2;
		
	}
	
	public int getResult(){
		
		return result;
		
	}
	
}
