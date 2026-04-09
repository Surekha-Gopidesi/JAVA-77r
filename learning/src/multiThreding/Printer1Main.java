package multiThreding;

public class Printer1Main {
		
		public static void main(String[] args) {
			Printer1 printer =new Printer1();
			User1 us1=new User1(printer);
			User2 us2=new User2(printer);
			Thread th1=new Thread(us1);
			Thread th2=new Thread(us2);
			th1.start();
			th2.start();
			
			
		}
		

	
}
