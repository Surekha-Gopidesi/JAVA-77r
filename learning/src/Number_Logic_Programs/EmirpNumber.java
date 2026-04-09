package Number_Logic_Programs;
public class EmirpNumber {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 13;
        int rev = reverse(num);
        if (isPrime(num) && isPrime(rev) && num != rev) {
            System.out.println(num + " is an EMIRP Number");
        } else {
            System.out.println(num + " is NOT an EMIRP Number");
        }
    }
}



