package task17_11_25;

public class Discount {
public void discount(int Amount){
	if(Amount>500) {
		System.out.println("10% discount");
	}
	else {
		System.out.println("No discount");
	}
}
	public static void main(String[] args) {
		Discount d=new Discount();
		d.discount(700);
		
	}

}
