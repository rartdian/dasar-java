package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int[] arrayAngka1 = {5,4,3,2,1};

		System.out.println("-------------------------");

		//merubah Array menjadi String
		cetakArray(arrayAngka1);

		System.out.println("-------------------------");
	
		//copy array dengan address yg berbeda
	System.out.println("\n copy array ");
	int[] arrayAngka2 = new int[5];
	cetakArray(arrayAngka1);
	cetakArray(arrayAngka2);

	System.out.println("-------------------------");
	
	System.out.println("copy Array dengan loop");
	for(int i = 0; i< arrayAngka1.length; i++) {
		arrayAngka2[i] = arrayAngka1[i];
	}

	cetakArray(arrayAngka1);
	System.out.println(arrayAngka1);
	cetakArray(arrayAngka2);
	System.out.println(arrayAngka2);
	
	System.out.println("-------------------------");
	System.out.println("\n mengcopy dengan copyOf");
	int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
	cetakArray(arrayAngka1);
	System.out.println(arrayAngka1);
	cetakArray(arrayAngka3);
	System.out.println(arrayAngka3);
	
	System.out.println("----------------------------------");
	System.out.println("mengcopy dengan copyOfRange");
	int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
	cetakArray(arrayAngka1);
	System.out.println(arrayAngka1);
	System.out.println(arrayAngka4);
	
	
	//fill
	System.out.println("===========================");
	int[] arrayAngka5 = new int[10];
	cetakArray(arrayAngka5);
	Arrays.fill(arrayAngka5, 5);
	cetakArray(arrayAngka5);
	
	//komparasi Array
	System.out.println("komparasi Array");
	int[] arrayAngka6 = {1,2,3,4,9};
	int[] arrayAngka7 = {1,2,3,4,5};
	
	System.out.println("\n membandinggkan 2 array");
	System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
	
	if (Arrays.equals(arrayAngka6, arrayAngka7)) {
		System.out.println("array ini sama");
	} else{
		System.out.println("array ini beda");
	}
	int[] cekarraybesar1 = {1,1,1,1,1};
	//int[] cekarraybesar2 = {1,1,1,1,1};
	int[] cekarraybesar3 = {1,2,2,2,2};
	
	System.out.println("\n Mengecek mana array yag lebih besar");
	System.out.println(Arrays.compare(cekarraybesar1, cekarraybesar3));
	
	System.out.println("\ncek mana index yang berbeda");
	System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
	
	
	//SOrt ARray
	System.out.println("\n sort Array");
	
	int[] arrayAngka8 = {1,6,4,5,3,5,2,6};
	cetakArray(arrayAngka8);
	Arrays.sort(arrayAngka8);
	cetakArray(arrayAngka8);
	
	//search array, sebelum melakukan search maka sorting dulu
	System.out.println("\n search array");
	
	int angka = 3;
	int posisi = Arrays.binarySearch(arrayAngka8, angka); //binarysearch harus di sorting terlebih dahulu
	System.out.println("angka "+angka+" ada di index "+posisi);
	
	/*
	 * tugas sorting kebalik
	 * melakukan operasi antar buah array
	 * menggabungkan dua buah array
	 * */
	
	
	
	}
	
	
	
	private static void cetakArray(int[] dataArray) {
		System.out.println("Array: "+ Arrays.toString(dataArray));
	}

}
