package com.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyData {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Surekha Gopidesi\\OneDrive\\Desktop\\abc.txt");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Surekha Gopidesi\\OneDrive\\Desktop\\abcd.txt");
		int data;
		while((data=fis.read())!=-1){
			fos.write(data);
		}
		fis.close();
		fos.close();
		System.out.println("File Copied Successfully...");

	}

}
