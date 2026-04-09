package whileloop;
public class Neon_number {
    public static void main(String[] args) {

        int num = 9;
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is NOT a Neon Number");
        }
    }
}
