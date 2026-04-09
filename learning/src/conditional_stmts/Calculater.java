package conditional_stmts;

public class Calculater {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		char operation='-';
		switch(operation){
		case'+':System.out.println("Addition :"+(a+b));
		break;
		case'-':System.out.println("Subtraction :" +(a-b));
		break;
		case'*' :System.out.println("multiplication :"+(a*b));
		break;
		case'/':System.out.println("division :"+(a/b));
		break;
		case'%':System.out.println("modulus :"+(a%b));
		}
		

	}

}
