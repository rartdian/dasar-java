package com.tutorial;
import java.util.Scanner;
import java.lang.String;
public class Main {

	public static void main(String[] args) {
		String kalimat  = "saya suka makan pisang";
		//mengambil komponen dari String
		System.out.println(kalimat.charAt(9));
		
		
		//substring mengambil kata
		String kata = kalimat.substring(5,9) ;
		System.out.println(kata);
	}

}
