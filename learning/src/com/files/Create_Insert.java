package com.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create_Insert {
	public static void main(String[] args) throws IOException {
		File f=new File("demo.txt");
		System.out.println("File Created");
		
		FileOutputStream fos=new FileOutputStream(f);
		String str="Helloworld";
		byte []bytes=str.getBytes();
		fos.write(bytes);
		fos.close();
		
	}

}
