package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Character_Stream_Write {

		public static void main(String[] args) throws IOException {
			FileWriter fw=new FileWriter("demo1.txt");
			fw.write("This is Character Stream in file Handling.. ");
			System.out.println("data Writted  Successfully...");
			fw.close();
			
		}}
