package com.inheritance;

public class Developer extends Guest {
	public void write() {
		System.out.println("write code here...");
	}
	public static void main(String[] args) {
//     Developer d=new Developer();  
//		d.read();      output: read code
//		d.write();             Write code here... 
		
//		Guest g=new Guest();
//		g.read();  ----> it will access        
//		g.write(); ----->compile time error
		
//		Guest g1=new Developer();
//		g1.read();   ---->we can access
//		g1.write();  ---->compile time error
		
//		Developer d1=(Developer) new Guest();
//		d1.read();
//		d1.write();-->it shows run time exception classCastException
		Guest g=new Developer();
		Developer d=(Developer) g;
	      d.read();     //--->read code
		  d.write();  //---->write code here	
	}
}
