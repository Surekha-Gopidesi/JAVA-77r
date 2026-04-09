package demo;
import java.util.Scanner;
public class PrimeNumber {
			    public static void main(String[] args) {
			        Scanner scanner = new Scanner(System.in);
			        System.out.print("Enter an integer: ");
			        int num = scanner.nextInt();
			        scanner.close();

			        System.out.println("Prime numbers up to " + num + ":");
			        for (int i = 2; i <= num; i++) {
			            if (isPrime(i)) {
			                System.out.print(i + " ");
			            }
			        }
			    }

			    public static boolean isPrime(int num) {
			        if (num <= 1) {
			            return false;
			        }
			        for (int i = 2; i * i <= num; i++) {
			            if (num % i == 0) {
			                return false;
			            }
			        }
			        return true;
			    }
			

	}


