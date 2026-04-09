package multiThreding;

public class Printer2Main {
	
		public static void main(String[] args) {
			Printer2 printer=new Printer2();
			Runnable us1=()->printer.print(3,"Surekha");
			Runnable us2=()->printer.print(3, "Bhanu");
			Thread th1= new Thread(us1);
			Thread th2=new Thread(us2);
			th1.start();
			th2.start();
				
		}
	

}
