package multiThreding;

public class NumberPrinter implements Runnable {
	private int start;
	private int end;
	
	public NumberPrinter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}

	public void run() {
		for(int i=start;i<=end;i++ ) {
			if(start%2==0&&i%2==0) {
//				System.out.println("even values :"+i);
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
			else if(start%2!=0&&i%2!=0) {
//				System.out.println("Odd values :"+i);
				System.out.println(Thread.currentThread().getName()+":"+i);
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		NumberPrinter num=new NumberPrinter(2, 20);
		NumberPrinter num1=new NumberPrinter(1, 19);
		
		Thread EvenThread=new Thread(num,"Even Thread");
		Thread OddThread=new Thread(num1,"Odd Thread");
		EvenThread.start();
		EvenThread.join();
		OddThread.start();
		
	}
	

}
