package task17_11_25;

public class Divisibility5And3 {
	int num=15;
	public void divide() {
		if(num%5==0 && num%3==0) {
			System.out.println("divisible by 3 and 5");
		}
		else if(num%5==0){
		System.out.println("divisible by 5");	
		}
		else  {
			System.out.println("divisible by 3");
		}
	}
	public static void main(String[] args) {
		Divisibility5And3 d1= new Divisibility5And3();
		d1.divide();
		
	}

}
