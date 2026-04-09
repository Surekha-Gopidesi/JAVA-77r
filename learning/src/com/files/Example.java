package com.files;

import java.io.File;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Surekha Gopidesi\\OneDrive\\Desktop/surekha.txt");
		System.out.println(f1.createNewFile());
		System.out.println(f1.delete());
		System.out.println(f1.exists());
	}

}
