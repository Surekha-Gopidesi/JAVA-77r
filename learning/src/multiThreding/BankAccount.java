package multiThreding;

class BankAccount {
	int balance=5000;
	public synchronized  void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+amount);
		balance+=amount;
		System.out.println("Updated balance :"+balance);
	}
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+amount);
		if(balance>=amount) {
		balance-=amount;
		System.out.println("Updated balance :"+balance);
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}
class CustomerThread extends Thread{
	BankAccount account;

	public CustomerThread(BankAccount account) {
		super();
		this.account = account;
	}
	public void run() {
		account.deposit(1000);
		account.withdraw(2000);
	}
	
}
