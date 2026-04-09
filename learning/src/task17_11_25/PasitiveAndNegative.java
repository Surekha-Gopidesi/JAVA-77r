package task17_11_25;

public class PasitiveAndNegative {
	

	public String checkNumber(int num) {
		if(num>0) {
			return "Positive";
		}
		else {
			return "negative";
		}
	}
	
		public static void main(String args[]) {
			PasitiveAndNegative p1=new PasitiveAndNegative();
			System.out.println(p1.checkNumber(-1));
		
	}
	
	}


