package task1;

public class SimpleIntrest {
	static int principal=5000;
	static int rate=5;
	static int time=2;

		public static void calculateIntrest() {
			double simpleIntrest=(principal*rate*time)/100;
			System.out.println("simple intrest:"+simpleIntrest);
		}

		public static void main(String[] args) {
		calculateIntrest( );
		

		}

	}


