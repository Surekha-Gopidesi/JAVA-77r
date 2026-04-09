package task17_11_25;

public class LargestofThreeNumbers {

	public void largest(int num1,int num2,int num3) {
		if(num1>num2) {
			 if(num1>num3) {
				System.out.println("The Largest Number:"+num1);
			  }
			 else {
				System.out.println("the Largest Number:"+num3);
			}
		}
		else {
			if(num2>num1) {
				System.out.println("The Largest Number:"+num2);
			}
		    else{
			System.out.println(" The Largest Number:"+num3);
		 }
		
	}
	}
	public static void main(String[] args) {
		LargestofThreeNumbers large=new LargestofThreeNumbers();
	large.largest(10,20,15);

	}

}
