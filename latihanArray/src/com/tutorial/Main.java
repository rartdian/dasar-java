package com.tutorial;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//penjumlahan antara dua array
		int[] arrayAngka1 = {1,2,3,6,7};
		int[] arrayAngka2 = {2,3,4,5,6};
		
		int[] arrayHasilnya = tambahArray(arrayAngka1, arrayAngka2);
		
		cetakArray(arrayAngka1, "array1");
		cetakArray(arrayAngka2, "array2");
		cetakArray(arrayHasilnya, "hasil penjumlahan\n\n");
		
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

cetakArray(hasilArray, "hasil penjumlahan\n");


//menggabungkan dua buat array
int[] arrayA = {3,4,5,6,7};
int[] arrayB = {8,9,10,11,12};

int[] arrayAB = new int[arrayA.length+arrayB.length];

for(int i = 0; i < arrayA.length; i++) {
	arrayAB[i] = arrayA[i];
}

for(int i= 0; i<arrayB.length;i++) {
	arrayAB[i+arrayA.length] = arrayB[i];
}

cetakArray(arrayA, "A");
cetakArray(arrayB, "B");
cetakArray(arrayAB, "gabunganAB");


System.out.println("\n\n");
//sorting reverse, mengurutkan tapi kebalik
cetakArray(arrayAngka1, "array1");
reverse2(arrayAngka1);
cetakArray(arrayAngka1, "reverse");


System.out.println("\n");
cetakArray(arrayAngka2, "array2");
reverse(arrayAngka2);
cetakArray(arrayAngka2, "reverse");


System.out.println("\n\n");

int[] tesArray= {6,7,8,9};
cetakArray(tesArray, "tes");
int[] a = Arrays.copyOf(tesArray, 2); //yg dicopy adalah jumlah index nya
cetakArray(a, "hasil tes"); ;

System.out.println(tesArray + " alamat asli");
System.out.println(a + " alamat setelah dicopy");

	}
	
	
	private static void reverse(int[] dataArray) {
		Arrays.sort(dataArray);
		int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);
		
		for (int i = 0; i <dataArray.length; i++) {
			dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
		}
	}
	private static void reverse2(int[] dataArray) { //belajar lagi
		Arrays.sort(dataArray);
		int buffer;
		
		for(int i = 0; i < dataArray.length/2;i++ ) {
			buffer = dataArray[i];
			dataArray[i] = dataArray[(dataArray.length-1)-i];
			dataArray[(dataArray.length - 1)- i] = buffer;
		}
	}
	
	private static int[] tambahArray(int[] arrayInt1, int[] arrayInt2) {
		int[] arrayHasil = new int[arrayInt1.length]; //membuat array index kosong dengan index sebanyak arrayInt1 untuk tampungan hasil
		for(int i = 0; i< arrayInt1.length;i++) {
			arrayHasil[i] = arrayInt1[i]+arrayInt2[i];
		}
		return arrayHasil;
	}

	private static void cetakArray(int[] dataArray, String message) {
		System.out.println("array -> "+ Arrays.toString(dataArray) + message);
	}
	
}
