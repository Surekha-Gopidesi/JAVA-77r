package conditional_stmts;

public class Temp {
	
		public void temp(int temp) {
			if(temp<0) {
				System.out.println("Cold");
			}
			else if(temp>=0 &&temp<=20) {
				System.out.println("warm");
			}
			else {
				System.out.println("Hot");
			}
		}
		public static void main(String[] args) {
			Temp temp=new Temp();
			temp.temp(25);
		}

	}



