package conditional_stmts;

public class Vote {
	
		public void canVote(int age) {
			if(age>18) {
			System.out.println("you are eligible for vote");
			}
			else {
				System.out.println("you are not eligible for vote");
			}
			
		}
		public static void main(String[] args) {
			Vote v1=new Vote();
			v1.canVote(20);
		}
		

	}



