package com.tutorial;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//penjumlahan antara dua array
		int[] arrayAngka1 = {1,2,3,6,7};
		int[] arrayAngka2 = {2,3,4,5,6};
		
		int x = arrayAngka1.length;
		int[] hasilArray = new int[x] ;
	
		
		for(int i=0; i< x ; i++) {
			System.out.println(hasilArray[i]);
		}

		
cetakArray(arrayAngka1, "array1");		
cetakArray(arrayAngka2, "array2");
for(int i=0;i<x;i++) {
	hasilArray[i] = arrayAngka1[i]+arrayAngka2[i];
}




cetakArray(hasilArray, "hasil");





}

	private static void cetakArray(int[] dataArray, String message) {
		System.out.println("array -> "+ Arrays.toString(dataArray));
	}
	
}
