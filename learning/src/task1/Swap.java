package task1;

public class Swap {
	static int x=10;
	static int y=20;
	public static void swap() {
		System.out.println("before swap x :"+x);
		
		int temp=x;
		x=y;
		 y=temp;
	
		System.out.println("after swap x :"+x);
	}

	public static void main(String[] args) {
		swap();

	}

}
