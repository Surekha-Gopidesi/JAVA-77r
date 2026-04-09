package linkedin;

public class DemoOnDatatypesAndVariables {
	
	    int rollNo = 101;               // Instance variable
	    
	    static String college = "PEC College"; // Static variable
	    
	     public void showInfo() {
	        String course = "Java";     // Local variable
	        System.out.println("Roll Number :"+rollNo + "\nCourse :" +course + "\nCollege Name : "+college);
	    }

	    public static void main(String[] args) {
	    	DemoOnDatatypesAndVariables obj = new DemoOnDatatypesAndVariables();
	        obj.showInfo();
	    }
	}

	
	



