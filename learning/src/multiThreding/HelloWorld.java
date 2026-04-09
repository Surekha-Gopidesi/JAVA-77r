package multiThreding;

public class HelloWorld extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Thread hello=new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello");
			}
			
		});
		Thread world=new Thread(()->
				System.out.println("World"));	
		hello.start();
		hello.join();
		world.start();
		
		
	}}



