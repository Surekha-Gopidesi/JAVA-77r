package task1;

public interface DemoOnInterface {
	

	    // Java 7 → Abstract method
	    void start();

	    // Java 8 → Default method (can have body)
	    default void charge() {
	        logStatus();       // calling private method (Java 9 feature)
	        System.out.println("Device is charging...");
	    }

	    // Java 8 → Static method (belongs to interface)
	    static void info() {
	        System.out.println("All devices should be portable and energy efficient.");
	    }

	    // Java 9 → Private method (used for internal code reuse)
	    private void logStatus() {
	        System.out.println("[LOG] Charging process initiated.");
	    }
	}

	
	



