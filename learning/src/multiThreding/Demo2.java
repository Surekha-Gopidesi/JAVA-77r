package multiThreding;

class  A1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
		System.out.println("main Method");
		A1 a=new A1();
		A1 b=new A1();
		Thread th1=new Thread(a);
		Thread th2=new Thread(b);
		th1.start();
		th2.start();
		System.out.println("main method ended");

	}

}
