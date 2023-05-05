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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	private static void cetakArray(int[] dataArray) {
		System.out.println("Array: "+ Arrays.toString(dataArray));
	}

}
