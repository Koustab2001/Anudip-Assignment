package labtest2;

public class BankMain {

	public static void main(String[] args) {
		
		//Instance of BankA,BankB,BankC
		BankA ba=new BankA();
		BankB bb=new BankB();
		BankC bc=new BankC();
		
		//Printing the methods
		System.out.println("Money deposit at Banks are as follows :-");
		System.out.println("Bank A: Rupees "+ba.getBalance());
		System.out.println("Bank B: Rupees "+bb.getBalance());
		System.out.println("Bank C: Rupees "+bc.getBalance());
	}

}
