package loops;

public class SwicthWithYeild2 {
	    public static void main(String[] args) {
	        int marks = 75;
	        String result = switch (marks / 10) {
	            case 9, 10: {
	                System.out.println("Excellent performance");
	                yield "Grade A";
	            }
	            case 8: {
	                System.out.println("Very Good");
	                yield "Grade B";
	            }
	            case 7: {
	                System.out.println("Good");
	                yield "Grade C";
	            }
	            case 6:{
	            	System.out.println("Average");
	            	  yield "Grade D";
	            }

	            default: {
	                System.out.println("Needs Improvement");
	                yield "Fail";
	            }
	        };
	        System.out.println(result);
	    }
	}


