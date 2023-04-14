package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//membuat sebuah objek untuk menangkap input dari user
		Scanner inputUser = new Scanner(System.in);
		
		//membuat program sedehana untuk menebak sebuah angka
		int nilaiBenar = 6;
		int nilaiTebakan;
		boolean statusTebakkan;
		
		System.out.print("masukkan nilai tebakkan anda: ");
		nilaiTebakan = inputUser.nextInt();
		System.out.println("nilai tebakkan anda = " +nilaiTebakan);
	
	//operasi logika
		statusTebakkan = (nilaiTebakan == nilaiBenar);
		System.out.println("tebakan anda: "+statusTebakkan);
		
		//Operasi aljabar boolean (and / or)
		
		System.out.print("masukkan nilai diantara 4 dan 9= ");
		
		nilaiTebakan = inputUser.nextInt();
		
		statusTebakkan = (nilaiTebakan > 4) && (nilaiTebakan < 9);
		System.out.println("Tebakkan anda : "+ statusTebakkan);
	}

}
