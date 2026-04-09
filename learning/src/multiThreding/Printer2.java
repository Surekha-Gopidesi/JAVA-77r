package multiThreding;

  class Printer2 {
	public synchronized void print(int n,String name) {
		for(int i=0;i<=n;i++) {
			System.out.println(name+ "-"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
