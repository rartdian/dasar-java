package com.tutorial;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {

		//sebelumnya menggunakan byte stream dengan 8 bit nya
		//negar barat kebanyanyakn menggunakan 8 bit dengan ascii codennya
		//negara lain menggunakan character sperti negara arab, jepang,cina
		
		//byte stream fokus ke 8 bitnya
		//sedangakan character stream fokus di character nya
		
		
		
		//membuka file
//		byte stream selalu menggunakan FileInputStream
//		Character stream menggunakan FileReader
		FileInputStream byteFileInput = new FileInputStream("input.txt");
		FileReader charFileInput = new FileReader("input.txt");
		
		FileOutputStream byteFileOutput = new FileOutputStream("outputByte.txt");
		FileWriter charFileOutput = new FileWriter("outputChar.txt");
		
//		membaca file
//		byte file
		int buffer = byteFileInput.read();
		
		while(buffer != -1) {
			System.out.print((char)buffer);
			byteFileOutput.write(buffer);
			buffer = byteFileInput.read();
		}
		
		System.out.println("\n");
//		char file
		buffer = charFileInput.read();
		
		while (buffer != -1) {
			System.out.print((char)buffer);
			charFileOutput.write(buffer);
			buffer = charFileInput.read();
		}
		
//		menutup file
	byteFileInput.close();
	charFileInput.close();
	byteFileOutput.close();
	charFileOutput.close();
	
	//byte stream dan char stream file tidak diolah di memory (unbuffered I/O)
	
	}

}
