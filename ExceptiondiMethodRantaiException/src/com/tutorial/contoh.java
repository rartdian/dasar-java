package com.tutorial;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class contoh {
		//menaruh throws exception di main method, menjadi error message sebelum compiling
		public static void main(String[] args) throws IOException {
				FileInputStream inputFile = new FileInputStream("input.txt");
			System.out.println((char)inputFile.read());
			
			System.out.println("akhir dari program");
		}
}
