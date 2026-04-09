package task17_11_25;

public class EvenAddProgram {
	public boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		if(num%2==1) {
			return false;
		}
	
		return true;
	}

	public static void main(String[] args) {
		EvenAddProgram e1=new EvenAddProgram();
		System.out.println(e1.isEven(11));

	}

}
