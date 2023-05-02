package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int[] arraysAngka = {2,3,4,2,1,2,3,4,3,4,5};
		
		//looping standard
		System.out.println("looping standard");
		for(int i = 0; i< 11;i++) {
			System.out.println("index ke- "+i+"adalah: "+ arraysAngka[i]);
		}
		
		//looping dengan properti array
		System.out.println("looping dengan properti array");
		for(int i = 0; i< arraysAngka.length; i++) {
			System.out.println("index ke- "+i+"adalah: "+ arraysAngka[i]);
		}
		
		
		//looping khusus untuk collection array
		//pakai foreach jika indexnya tidak dibutuhkan
		System.out.println("banyaknya array ada: "+arraysAngka.length); 
		for(int angka:arraysAngka) {
			//jumlah array
			System.out.println(angka);
		}

	}

}
