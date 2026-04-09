package multiThreding;


class A extends Thread{
@Override
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(" method1"+ i);
	}
	
}
}
class B extends Thread{
@Override
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(" method2"+ i);
	}	
}
}
public class Demo {
	public static void main(String[] args) {
		System.out.println("main method started");
		Thread th1=new A();
		Thread th2=new B();
		th1.start();
		th2.start();
		
		System.out.println("Main method ended");
	}

}
