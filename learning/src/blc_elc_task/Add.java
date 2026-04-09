package blc_elc_task;

public class Add {
	int num1;
	int num2;
	public int getNum1() {
		return num1;
	}
	public void setNum1( int Num1) {
		num1=Num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int Num2) {
		num2=Num2;
	}
	public void display() {
		System.out.println("Addition of two numbers :");
	}

public static void main(String[] args) {
	Add a=new Add();
	a.setNum1(34);
	a.setNum2(87);
	System.out.println("Adition of two numbers :"+a.getNum1()+a.getNum2()+"hello");
	
}
}
