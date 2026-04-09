package task17_11_25;

public class UserName {
	String userName="Admin";
	public void user() {
		if(userName=="user") {
			System.out.println("Access granted");
		}
		else {
			System.out.println("Access denied");
		}
	}
public static void main(String[] args) {
	UserName user=new UserName();
	user.user();
}
}
