package structuralAdapterPattern;

public class AdapterPatternDemo {
	public static void main(String args[]){  
		  BankCustomer targetInterface = new BankCustomer();  
		  targetInterface.giveBankDetails();  
		  System.out.print(targetInterface.getCreditCard());  
		 }   
}
