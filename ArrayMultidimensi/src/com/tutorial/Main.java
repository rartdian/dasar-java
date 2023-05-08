package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
System.out.println("Belajar Array multidimensi \n");

//cara membuat array 2 dimensi dengan assignment

int[][] array_2D = {
		
		{1,2},{3,4}
};



	}
	
	public static void cetakArray2D(int[][] dataArray) {
		System.out.print("\n");
		for(int[] baris: dataArray) {
			System.out.print("{");
			for(int angka : baris) {
				System.out.print(angka + ",");
			}
			System.out.print("}\n");
		}
		System.out.print("}\n");
	}

}
