package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Character_Stream_Read {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
			
		}
		System.out.println("\ndata readed Successfully...");
		fr.close();
		

	}

}
