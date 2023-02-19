package Java;

public class logicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 6; 
		
		// both conditions must be true
		System.out.println(a == 3 && b == 6);
		// at least one condition must be true
		System.out.println(a == 1 || b == 6);
		// condition not 
	    System.out.println(!(a == 3 || b == 6));
	}

}
