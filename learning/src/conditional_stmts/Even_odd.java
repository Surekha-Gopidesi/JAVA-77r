package conditional_stmts;

public class Even_odd {
	
		public void isEven(int num) {
			if(num%2==0) {
				System.out.println("even number");
			}
			if(num%2==1) {
				System.out.println("odd Number");
			}
		
			
		}

		public static void main(String[] args) {
			Even_odd e1=new Even_odd();
			e1.isEven(11);

		}

	}



