package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) {
		String kalimat  = "saya suka makan pisang";
		//mengambil komponen dari String
		System.out.println(kalimat.charAt(9));
		
		
		//substring mengambil kata
		String kata = kalimat.substring(5,9) ;//disimpan di memory heap
		System.out.println(kata);
	
		//menggabungkan dua buah string, concatenation
		String kalimat2 = kata + " juice";
		System.out.println(kalimat2);
		
		kata = kata + " minum"; //simpan di memory string pool
		System.out.println(kata);
	}

}
