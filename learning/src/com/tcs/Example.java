package com.tcs;

public class Example {
	//even odd
	public static void EvenOrodd(int num) {
		if(num%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("Odd");
		}
	}
	//prime
	public static boolean isprime(int num) {
		if(num<=1) {
			return false;
		
		}
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				return false;
			}
		}return true;
	}
	//fact
	public static int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	//fibonacci
	public static void fibonacci(int n) {
		int a=0;
		int b=1;
		System.out.print("The fibonacci series :"+a+","+b+"");
		for(int i=2;i<=n;i++) {
			int c=a+b;
			System.out.print(", "+c);
			a=b;
			b=c;
		}
		System.out.println();
		
		
	}
	//reverse
	public static int reverse(int num) {
	
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		return rev;
	}
	//palindrome
	public static boolean palindrome(int num) {
		int temp=num;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			
		}
		return rev==temp;
	}
	//sum of digits
	public static int sum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			int rem=n%10;
			sum=sum+rem;
			n/=10;
			
		}return sum;
				
	}
	
	public static int largest(int a,int b,int c) {
		int max=Math.max(a,Math.max(b, c));
		
			
		return max;
		
	}
	
	public static int getPower(int base,int exp) {
		int power=1;
		for(int i=1;i<=exp;i++) {
			power=power*base;
			
		}
		return power;
	}
	public static int getcount(int num) {
		int count=0;
		while(num>0) {
			count++;
			num/=10;
		}return count;
	}
	public static boolean isArmstrong(int num) {
		int temp=num;
		int count=getcount(num);
		int sum=0;
		while(num>0){
			int rem=num%10;
			sum=sum+getPower(rem,count);
			num/=10;
				
		}return sum==temp;
	}
	//perfect
	public static void perfect(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(num==sum) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("Not a perfect Number");
		}
	}
	public static void countVowelConsonant(String s) {
		int vowelCount=0;
		int consonantCount=0;
		for(int i=0;i<s.length();i++) {
		   char ch=s.charAt(i);
		   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			   vowelCount++;
		   }
		   else {
			   consonantCount++;
		   }
		}
		System.out.println("Vowel Count :"+vowelCount);
		System.out.println("Consonant Count : "+consonantCount);
	}
	
	
	
	public static void main(String[] args) {
		EvenOrodd(5);//1
		System.out.println(isprime(11)?"prime":"Not prime");//2
		System.out.println(fact(5));//3
		fibonacci(10);//4
		System.out.println("Reverse of a number:"+reverse(1234));
		System.out.println(palindrome(121222)?"palindrome":"Not apalindrome");
		System.out.println("Sum :"+sum(1234));
		System.out.println("Largest element "+largest(2,10,4));
		System.out.println(isArmstrong(153)?"Armstrong":"Not a ArmStrong");
		perfect(28);
		countVowelConsonant("aeiou");
		
	}

}
