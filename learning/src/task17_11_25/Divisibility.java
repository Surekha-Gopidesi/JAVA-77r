package task17_11_25;

public class Divisibility {
	public boolean isDivisibleBy5(int num) {
		if(num%5==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Divisibility d=new Divisibility();
	System.out.println(	d.isDivisibleBy5(11));
	}
	

}
