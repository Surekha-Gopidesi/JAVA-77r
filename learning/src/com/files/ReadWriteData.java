package com.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteData {
	public static void main(String[] args) throws IOException {
		String loc="C:\\Users\\Surekha Gopidesi\\OneDrive\\Desktop\\abcd.txt";
		File f=new File(loc);
		if(!(f.exists())) {
			f.createNewFile();
			System.out.println("File Created..");
			
		}
		FileOutputStream fos= new FileOutputStream(f);
		String str="hi dear....";
		System.out.println("Data entered Successfully");
		 byte[] bytes=str.getBytes();
		 fos.write(bytes);
		 fos.close();
	}

}
