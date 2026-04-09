package Number_Logic_Programs;

public class Automorphic {
	public void num(int num) {
		int square=num*num;
		int last=square%10;
		if(last==num) {
			System.out.println(num+ " Automorphic Number");
		}
		else {
			System.out.println(num+" Not a Automorphic Number");
		}
	}

	public static void main(String[] args) {
		Automorphic a=new Automorphic();
		a.num(6);
		a.num(8);
		}
		

	}


