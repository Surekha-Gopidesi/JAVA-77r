package task1;

public class SquareCube {
	
	    static int num = 5;

	   public static int square() {
	        return num * num;
	    }

	    static void cube() {
	        int square = square();      
	        int cubeValue = square * num;
	        
	        System.out.println("Square: " +square);
	        System.out.println("Cube: " +cubeValue);
	    }

	    public static void main(String[] args) {
	        cube();
	    }
	}



