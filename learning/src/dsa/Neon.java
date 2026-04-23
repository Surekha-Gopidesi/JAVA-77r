package dsa;
import java.util.*;

public class Neon {
		public static void check() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number..");
			int n=sc.nextInt();
			int square=n*n;
			int temp=square;
			int sum=0;
			while(temp>0) {
				int rem=temp%10;
				sum=sum+rem;
				temp/=10;	
			}
	
			System.out.println((sum==n)?"Neon":"Not a Neon");
		}

		public static void main(String[] args) {
			check();
			 
		}

	}



