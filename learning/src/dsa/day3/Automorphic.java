package dsa.day3;

public class Automorphic {
	public static void display(int num) {
        int square = num * num;
        int temp = num;
        boolean isAutomorphic = true;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                isAutomorphic = false;
                break;
            }
            temp = temp / 10;
            square = square / 10;
        }

       System.out.println((isAutomorphic)?+num+" is Automorphic Number":+num+" is Not a Automorphic Number");
       }
  public static void main(String[] args) {
	  display(25);
	  display(620);

  }

}
