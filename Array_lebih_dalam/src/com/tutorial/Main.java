package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int[] arrayAngka1 = {1,2,3,4,5};
		int[] arrayAngka2 = new int[5];
		
		System.out.println(arrayAngka1);
		System.out.println(arrayAngka2);
		
		System.out.println("array 1-> "+ Arrays.toString(arrayAngka1));
		System.out.println("array 2-> "+Arrays.toString(arrayAngka2));
		
		//memindahkan address, akan memberikan referensinya bukan memberikkan nilainya
		//perbedaan data primitif dengan array
		arrayAngka2 = arrayAngka1; //maka arrayangka2 menunjuk lokasi arrayangka1, sehingga apapun perubahan isi arrayangka1 maupun arrayangka2 sama.
		
		System.out.println(arrayAngka1);
		System.out.println(arrayAngka2);
		
		System.out.println("array 1-> "+Arrays.toString(arrayAngka1));
		System.out.println("array 2-> "+Arrays.toString(arrayAngka2));
		
		arrayAngka1[4] = 400;
		
	ubaharray(arrayAngka1);
	
	System.out.println("dari method ubaharray angka1 [0]->"+ Arrays.toString(arrayAngka1));
	System.out.println("arrayangka2 karena sudah dipindahkan addressnya arrayangka2->"+ Arrays.toString(arrayAngka2));
	}
	
	//method yang argumennya aadalah referensinya, bukan nilainya atau pass by reference
	//bukan pass ny value
	//tidak menambah alokasi nilai baru
	private static void ubaharray(int[] dataArray) {
		for(int data:dataArray) {
			System.out.println(data);
		}
		
		dataArray[0] = 125;
		
		for(int data:dataArray) {
			System.out.println(data);
		}
	}

}
