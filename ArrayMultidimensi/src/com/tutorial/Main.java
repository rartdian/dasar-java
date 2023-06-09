package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
System.out.println("Belajar Array multidimensi \n");

//cara membuat array 2 dimensi dengan assignment

int[][] array_2D = {
		
		{1,2},{3,4}
};

cetakArray2D(array_2D);

// cara membuat array 2 dimensi dengan deklarasi
// 					int [baris][kolom]
int[][] arrayAngka = new int[5][4];
cetakArray2D(arrayAngka);

//looping lengkap dengan cara manual

for(int i = 0; i< array_2D.length; i++) {
	System.out.print("[");
	for(int j = 0; j < array_2D[i].length;j++) {
		System.out.print(array_2D[i][j]+",");
	
	}
	System.out.print("]\n");
}

System.out.println("\n");

//looping array2d dengan foreach
for(int[]baris:arrayAngka) {
	System.out.print("[");
	for(int angka : baris) {
		System.out.print(angka + ",");
	}
	System.out.print("]\n");
}

System.out.println("\n Cetak Array 2D dengan library Arrays.deepToString");
cetakArraydeepToString(array_2D);
	
	
	System.out.println("\n");
	int[][] array2D_tes = {
			{1,2,3,4,5},
			{6,7,8},
			{9,10}
	};
	
	cetakArray2D(array2D_tes);
	
	}
	
	public static void cetakArray2D(int[][] dataArray) {
		System.out.print("{\n");
		for(int[] baris: dataArray) {
			System.out.print("{");
			for(int angka : baris) {
				System.out.print(angka + ",");
			}
			System.out.print("}\n");
		}
		System.out.print("}\n");
	}
	
	public static void cetakArraydeepToString(int[][] dataArray) {
		System.out.println(Arrays.deepToString(dataArray));
	}

}
