package task1;

public class MethodChaining {
      static int a=20;
      static int b=30;
      public static int  sum() {
    	  return a+b;
			/*
			 * int add=a+b; System.out.println(add);
			 */
      }
      public static void average() {
			/* int average=(a+b)/2; */
    	  int res=sum();
    	 int average=res/2;
    	  System.out.println(average);
    	  
      }

	public static void main(String[] args) {
		average();
		
		

	}

}
