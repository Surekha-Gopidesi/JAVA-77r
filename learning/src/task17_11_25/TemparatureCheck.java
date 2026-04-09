package task17_11_25;

public class TemparatureCheck {
	public void temp(int temp) {
		if(temp>30) {
			System.out.println("hot");
		}
		else {
			System.out.println("cool");
		}
	}
	public static void main(String[] args) {
		TemparatureCheck temp=new TemparatureCheck();
		temp.temp(25);
	}

}
