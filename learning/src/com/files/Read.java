package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Read {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Surekha Gopidesi\\OneDrive\\Pictures\\pro3.jpg");
		FileOutputStream fos=new FileOutputStream("pro.jpg");
		int i;
		while((i=fis.read())!=0) {
			System.out.println("Data readed successfully");
			System.out.println(i);
			fos.write(i);
		}
	
		fis.close();
		fos.close();
	}

}
