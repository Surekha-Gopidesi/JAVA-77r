package multiThreding;

public class MainPrinter {

	public static void main(String[] args) {
		Printer p=new Printer(5);
		User u1=new User("Surekha", p, "Document1");
		User u2=new User("Sushma", p, "Document2");
		User u3=new User("Bhanu", p, "Document3");
		User u4=new User("Suri", p, "Document4");
		u1.start();
		u2.start();
		u3.start();
		u4.start();

	}

}
