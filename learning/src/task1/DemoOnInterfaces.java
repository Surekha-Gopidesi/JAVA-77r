package task1;

public class DemoOnInterfaces implements DemoOnInterface  {
	
	    public void start() {
	        System.out.println("Mobile started successfully!");
	    }
	
        public static void main(String[] args) {
	        DemoOnInterfaces m = new DemoOnInterfaces();
				
	
		
	        m.start();       // Calls abstract method
	        m.charge();      // Calls default method
	        DemoOnInterface.info();   // Calls static method
	    }
}


