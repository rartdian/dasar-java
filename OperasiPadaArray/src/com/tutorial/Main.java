package com.tutorial;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		int[] arrayAngka1 = {5,4,3,2,1};
		
		//merubah Array menjadi String
		cetakArray(arrayAngka1);
	}
	
	private static void cetakArray(int[] dataArray) {
		System.out.println("Array: "+ Arrays.toString(dataArray));
	}

}
