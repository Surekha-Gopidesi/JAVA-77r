package task17_11_25;

public class Vote {
	public boolean canVote(int age) {
		if(age>18) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Vote v1=new Vote();
		System.out.println(v1.canVote(20));
	}
	

}
