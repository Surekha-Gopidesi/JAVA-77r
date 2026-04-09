package blc_elc_task;

public class BankApplication {

	public static void main(String[] args) {
	BankAccount b1=new BankAccount();
	b1.setAccountNumber(5456789654l);
	b1.setAccountHolderName("Surekha");
	b1.setBalance(50000l);
	System.out.println("Account Number :"+b1.getAccountNumber());
	System.out.println("Name :"+b1.getAccountHolderName());
	System.out.println("Balance :"+b1.getBalance());
	b1.setBalance(b1.getBalance()+2000);
	System.out.println("modified balnce:" +b1.getBalance());
	}

}
