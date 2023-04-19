package com.tutorial;

public class Main {

	public static void main(String[] args) {
		
		//break, continue dan return
		
		int a=0;
		while(true) {
			a++;
			if(a==10) {
				break; //keyword untuk memaksa keluar dari loop
			} else if (a == 5){
				continue; //ini adalah keyword untuk memaksa memulai aksi dari awal
			} else if (a == 7) {
				return; //adalah pasangan dari static void main, untuk menyelesaikan program static void main
			}
			System.out.println("looping ke - "+ a);
		}
		System.out.println("akir dari looping");
	}

}
