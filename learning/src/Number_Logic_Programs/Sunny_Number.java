package Number_Logic_Programs;

public class Sunny_Number {
	public void sunny(int num) {
		int num2=num+1;
		double sqrt=Math.sqrt(num+1);
		if(sqrt==(int)sqrt) {
			System.out.println(num+" is a Sunny Number ");
		}
		else {
			System.out.println((num+" Not a Sunny Number"));
		}
	}
	public static void main(String[] args) {
		Sunny_Number s1=new Sunny_Number();
		s1.sunny(8);
		s1.sunny(9);
	}
}
