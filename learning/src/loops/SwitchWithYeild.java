package loops;

public class SwitchWithYeild {
	    public static void main(String[] args) {
	        int day = 3;
	        String result = switch(day) {

	            case 1:
	                yield "Monday";

	            case 2:
	                yield "Tuesday";

	            case 3:
	                yield "Wednesday";

	            default:
	                yield "Invalid Day";
	        };
	        System.out.println(result);

	    }

	}


