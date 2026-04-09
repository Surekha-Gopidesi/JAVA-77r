package multiThreding;

public class Main {
	public static void main(String[] args) {
		BankAccount account=new BankAccount();
		CustomerThread th1=new CustomerThread(account);
		CustomerThread th2=new CustomerThread(account);
		th1.start();
		th2.start();
	}
}
