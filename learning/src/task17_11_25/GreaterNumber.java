package task17_11_25;

public class GreaterNumber {
	public int findGrater(int num1,int num2) {
		if(num1>num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	public static void main(String args[]) {
		GreaterNumber g=new GreaterNumber();
		System.out.println(g.findGrater(10,20));
	}
	

}
