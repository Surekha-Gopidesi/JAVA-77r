package com.patterns;

public class Example2 {

	public static void main(String[] args) {
		int n=3;
		//pattern 1
		System.out.println("pattern 1");
		for (int i=0;i<=n;i++) {
			char ch=(char)('A'+i);
			for(int j=0;j<=n;j++) {
		
				System.out.print(ch);
			}
			System.out.println(" ");
			
		}
		
		//pattern2
		System.out.println("pattern 2");
		for (int i=0;i<=n;i++) {
			
			for(int j=0;j<=n;j++) {
			char ch=(char)('A'+j);
				System.out.print(ch);
			}
			System.out.println(" ");
			
		}
		
		//pattern 3
		System.out.println("pattern 3");
		char c='A';
		for (int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
		
				System.out.print(c);
				c++;
			}
			System.out.println(" ");
			
		}
		
		//pattern4
	
		int x=1;
				System.out.println("pattern 4");
				for (int i=1;i<=n;i++) {
					
					for(int j=1;j<=n;j++) {
				
						System.out.print(x+" ");
						x++;
					}
					System.out.println("  ");
					
				}
				
				
				//pattern5
				
				
						System.out.println("pattern 5");
						for (int i=1;i<=n;i++) {
							int x1=1;
							for(int j=1;j<=n;j++) {
						
								System.out.print(x1+" ");
								x1++;
							}
							System.out.println("  ");
							
						}

						
						//pattern 6
						System.out.println("pattern 6");
						int x1=1;
						for (int i=1;i<=n;i++) {
							
							for(int j=1;j<=n;j++) {
								
								System.out.print(x1+" ");
								
							
							}
							x1++;
							
							System.out.println("  ");
							
						}
						
						//pattern 7
						System.out.println("pattern 7");
						char c1='Z';
						for (int i=1;i<=n;i++) {
							for(int j=1;j<=n;j++) {
						
								System.out.print(c1);
								c1--;
							}
							System.out.println(" ");
							
						}

				
	}

}
