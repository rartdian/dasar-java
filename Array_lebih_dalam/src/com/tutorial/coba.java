package com.tutorial;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class coba {

	public static void main(String[] args) {
		System.out.println("COntoh Soal\n");
		String hasil;
		int benar=0, salah=0;
		
		String[] dataArray = new String [6];
		
		dataArray[0] = "soal 1 + 1 = ...";
		dataArray[1] = "3";
		dataArray[2] = "4";
		dataArray[3] = "5";
		dataArray[4] = "8";
		dataArray[5] = "semua salah";
		

		for(int i = 0; i<dataArray.length;i++) {
			System.out.println(dataArray[i]);
		}
		
		Scanner jawabanAnda = new Scanner(System.in);
		System.out.print("pilih a,b,c,d");
		hasil = jawabanAnda.nextLine();
	
		switch (hasil) {
		case "a": {
			 
			System.out.println("jawaban anda salah");
			System.out.println("kunci jawaban benar adalah "+dataArray[4]);
		//int salah+1;
		}break;
		case "b":{
			System.out.println("jawaban anda salah");
			System.out.println("kunci jawaban benar adalah "+dataArray[4]);
		}break;
		case "c":{
			System.out.println("jawaban anda salah");
			System.out.println("kunci jawaban benar adalah "+dataArray[4]);	
		}
		break;
		case "d":{
			System.out.println("jawaban anda salah");
			System.out.
			println("kunci jawaban benar adalah "+dataArray[4]);	
			
		}break;
		case "e":{
			System.out.println("jawaban anda benar");
			
		}break;
		}
		
		dataArray[0] = "2+2 = ";
		dataArray[1] = "3";
		dataArray[2] = "4";
		dataArray[3] = "5";
		dataArray[4] = "2";
		dataArray[5] = "semua salah";
		
		Scanner jawabanAnda2 = new Scanner(System.in);
		System.out.print("pilih a,b,c,d");
		hasil = jawabanAnda2.nextLine();
		
		switch (hasil) {
		case "a": {
			 
			System.out.println("jawaban anda salah");
			System.out.println("kunci jawaban benar adalah "+dataArray[2]);
		//int salah+1;
		}break;
		case "b":{
			System.out.println("jawaban anda benar");
//			System.out.println("kunci jawaban benar adalah "+dataArray[2]);
		}break;
		case "c":{
			System.out.println("jawaban anda salah");
			System.out.println("kunci jawaban benar adalah "+dataArray[2]);	
		}
		break;
		case "d":{
			System.out.println("jawaban anda salah");
			System.out.
			println("kunci jawaban benar adalah "+dataArray[2]);	
			
		}break;
		case "e":{
			System.out.println("jawaban anda salah");
			System.out.
			println("kunci jawaban benar adalah "+dataArray[2]);
		}break;
		}
		
	}
	

}
