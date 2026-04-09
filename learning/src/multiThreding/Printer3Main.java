package multiThreding;

public class Printer3Main {
	public static void main(String[] args) {
		Printer3 printer=new Printer3();
		Runnable user1=()->printer.print(3, "Prakash");
		Runnable user2=()->printer.print(3, "Surendra");
		Thread th1=new Thread(user1);
		Thread th2=new Thread(user2);
		th1.start();
		th2.start();
			
	}
	

}
