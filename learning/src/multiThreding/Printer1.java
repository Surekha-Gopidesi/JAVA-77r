package multiThreding;

class Printer1 {
   public void print(int n,String name) {
	   for(int i=1;i<=n;i++) {
		   System.out.println(name+"-"+i);
		   try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}}}}
class User1 implements Runnable{
	Printer1 printer;

	public User1(Printer1 printer) {
		super();
		this.printer = printer;
	}
	@Override
	public void run() {
		synchronized(printer) {
			printer.print(5, "Sushma");
		}
			
		}
}
class User2 implements Runnable{
	Printer1 printer;
	

	public User2(Printer1 printer) {
		super();
		this.printer = printer;
	}
	@Override
	public void run() {
		synchronized(printer) {
		printer.print(5, "Surekha");
		}
	}
}


