package com.cg.trycatch;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream f1;
		try {
			f1 = new FileInputStream("C:/myfile.txt");
		}
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		int k;
		try {
			while((k = f1.read()) != -1) {
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
		f1.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
