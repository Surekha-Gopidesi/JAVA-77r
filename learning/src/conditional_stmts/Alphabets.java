package conditional_stmts;

public class Alphabets {
	public void vowelConsonant(char letter) {
		
		if(letter=='a' || letter=='e' ||letter=='i'||letter=='o'||letter=='u' ) {
			System.out.println("vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

	public static void main(String[] args) {
		Alphabets a=new Alphabets();
		a.vowelConsonant('k');

	}

}
