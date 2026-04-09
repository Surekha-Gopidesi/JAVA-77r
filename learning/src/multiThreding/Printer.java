package multiThreding;

public class Printer {

	int paperCount;

	public Printer(int paperCount) {
		super();
		this.paperCount = paperCount;
	}
	public synchronized void printDocument(String document,String username) {
		if(paperCount>0) {
			paperCount--;
			System.out.println(username );
			System.out.println(document);
			System.out.println("Available papers :"+paperCount);
			
		}
		else {
			System.out.println("printind cannot proceed");
		}
	}

}
class User extends Thread{
	String name;
	Printer printer;
	String document;
	public User(String name, Printer printer, String document) {
		super();
		this.name = name;
		this.printer = printer;
		this.document = document;
	}
	public void run() {
		printer.printDocument(document, name);
	}
	
}
