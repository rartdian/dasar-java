package com.tutorial;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//looping bersarang
	
	for(int i = 0; i <= 5; i++) {
		System.out.print("i-> "+i);
		for(int j = 0; j < 5; j++) {
			System.out.print(" j-> "+j+",");
			System.out.print("*");
		}
		System.out.print("\n");
	}
	
	System.out.println();

		for(int i = 0; i<5; i++) {
			
			for(int j = 0; j<5; j++) {
				System.out.print("* ");	
				if(i == j) {
				break;
			}		
			}
			System.out.print("\n");
		}
		
		
		System.out.print("\n");
		
		for(int i=0;i<5;i++) {
				
			for(int j=0;j<5;j++) {
				System.out.print("* ");
				if(i+j == 4 ) {
					break;
				}
				
			}
			System.out.print("\n");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i <=10;i++) {
			System.out.print(i);
			for(int j= 0; j<=10; j++) {
				
				System.out.print(j);	
				if(i+j == 8) {
					break;
				}
				
			}
			System.out.print("\n");
		}
	}

}
