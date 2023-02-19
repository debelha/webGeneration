package Java;

public final class ifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int stock = 55;
		
		if(stock >= 100) {
			System.out.println("Enough product");
		}else if(stock <100 && stock > 50) {
			System.out.println("A new request is indicated");
		}else{
			System.out.println("Alert: urgent request"); 
		}		
	}
}
