package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		//Pertambahan Matrix
		int[][] matrix_a = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				
		};
		
		int[][] matrix_b = {
				{11,12,13},
				{14,15,16},
				{17,18,19}
		};
		
		//menghitung banyaknya kolom array
		System.out.println(matrix_a[1].length);
		
		//menghitung banyaknya baris
		System.out.println(matrix_a.length);
		
		cetakArray(matrix_a);
		cetakArray(matrix_b);

		int[][] hasil_tambah = tambah(matrix_a, matrix_b);
		System.out.println("\n");
		cetakArray(hasil_tambah);
	
		//Perkalian Matrix
		int[][] matrix_c = {
				{1,2},
				{3,4}
		};
		int[][] matrix_d = {
				{5,6},
				{7,8}
		};
		
		int[][] hasil_perkalian = perkalian(matrix_c, matrix_d);
		System.out.println("\n Perkalian Matrix");
		cetakArray(hasil_perkalian);
	}
	private static int[][] perkalian(int[][] matrix_1, int[][] matrix_2){
		int baris_1 = matrix_1.length;
		int kolom_1 = matrix_1[0].length;
		
		int baris_2 = matrix_2.length;
		int kolom_2 = matrix_2[0].length;
		
		//jika a . b jumlah baris akan mengikuti matrix a, kolom akan mengikuti kolom b
		
		int[][] hasil = new int[baris_1][kolom_2];//?????
	int buffer;
	for(int i = 0; i< baris_1; i++) {
		for(int j = 0; j < kolom_2; j++) {
			buffer = 0;
			for (int k = 0; k < kolom_1; k++) {
				buffer += matrix_1[i][k] * matrix_2[k][j];
			}
			hasil[i][j] = buffer;
		}
	}
	return hasil;
	}
	
	
	private static int[][] tambah(int[][] matrix_1, int[][] matrix_2){
		int baris_1 = matrix_1.length;
		int kolom_1 = matrix_1[0].length;
	
		int baris_2 = matrix_2.length;
		int kolom_2 = matrix_2[0].length;
		
		int[][] hasil = new int [baris_1][kolom_1]; //hasil adalah sejumlah array kosong dengan jumlah baris nya x dan kolom x
		if (baris_1 == baris_2 && kolom_1 == kolom_2) {
			for(int i = 0; i< baris_1; i++) {
				for(int j = 0; j< kolom_1;j++) {
					hasil[i][j] = matrix_1[i][j] + matrix_2[i][j];
				}
			}
		}
		else {
			System.out.println("jumlah baris atau kolom tidak sama");
		}
		return hasil;
	
	
	}
	
	
	
	public static void cetakArray(int[][] dataArray) {
		int baris = dataArray.length;
		int kolom = dataArray[0].length;
		
			for(int i = 0; i < baris; i++) {
				System.out.print("[");
				for (int j=0; j < kolom; j++) {
				System.out.print(dataArray[i][j]);	
				
				if(j < (kolom - 1)) {
				 System.out.print(",");	
				}
				}
				System.out.print("] \n");
			}
		
		
	}

}
