package linkedin;

public class BankAccount {
	
	    static void bankInfo() { //  Static Method
	        System.out.println("Welcome to SBI Bank ");
	    }

	    void openAccount() {//// Non-parameterized Instance Method
	        System.out.println("Your account has been opened successfully ");
	    }
	    
	    void deposit(double amount) { //  Parameterized Instance Method
	        System.out.println("Deposited: ₹" + amount);
	    }

	    double checkBalance() {  //  Return Type Instance Method
	        double balance = 15000.50;
	        return balance;
	    }

	    void withdraw(double amount) {  //  Void Instance Method( Instance Method)
	    	System.out.println("Withdrawal successful , Amount: ₹" + amount);
	    }

	    void loanInfo() {    // Method Overloading(Instance method)
	        System.out.println("General Loan Info: Interest rate is 8.5%");
	    }
	    void loanInfo(String type) {
	        System.out.println(type + " Loan Interest Rate: 7.5%");
	    }

	    void thankCustomer() {// Simple Predefined Method Example(Instance Method)
	        System.out.println("Thank you for banking with us!");
	    }

	    public static void main(String[] args) {
	       
	        bankInfo();     // Calling static method

	        BankAccount account = new BankAccount();// Creating object for instance methods

	        account.openAccount();         // Calling non-parameterized method

	        account.deposit(5000);           // Calling parameterized method

	        // Calling return type method
	        System.out.println("Available Balance: ₹" + account.checkBalance());

	      
	        account.withdraw(2000);           // Calling void method

	        
	        account.loanInfo();              // Calling overloaded methods
	        account.loanInfo("Home");

	        account.thankCustomer();         // Calling simple predefined method
	    }
	}


